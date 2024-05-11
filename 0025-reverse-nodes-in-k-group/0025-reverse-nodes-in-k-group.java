/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode A, int k) {


         if(k==1){
            return A;
        }
        ListNode temp = new ListNode(0);
        temp.next = A;
        ListNode grpPrev = temp;
        ListNode curr = A;
        ListNode kth = A;
        ListNode grpNext =A;
       
       while(true){
           curr=grpPrev.next;
           kth = findKthElement(grpPrev,k);
           if(kth==null){
               break;
           }
           grpNext = kth.next;
           revKElement( curr, k);
           grpPrev.next=kth;
           curr.next = grpNext;
           grpPrev = curr;

       }


    return temp.next;
        
    }
    public ListNode revKElement(ListNode A,int k){

        ListNode prev = null;
        ListNode curr = A;
        ListNode next= A;

        while(curr!=null && k>0){
            next = curr.next;
            k--;
            curr.next = prev;
            prev= curr;
            curr= next;

        }
        return prev;
    }

    public ListNode findKthElement(ListNode A,int k){

        while(k>0 && A!=null){
            A= A.next;
            k--;

        }
        return A;
    }
}