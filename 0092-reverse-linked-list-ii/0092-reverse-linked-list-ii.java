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
    public ListNode reverseBetween(ListNode A, int B, int C) {
        
        if(B==C){
            return A;
        }

        int k = C-B+1;
        ListNode temp = new ListNode(0);
        temp.next =A;
        ListNode grpNext = findKthElement(A,C);
  
        ListNode curr = temp;
        while(curr!=null&& B>1){
            B--;
            curr=curr.next;
        }

        ListNode grpHead = curr.next;


        ListNode rev = revKElement(curr.next,k);
        grpHead.next = grpNext;
        curr.next =rev;

        return temp.next;
    }


     public ListNode findKthElement(ListNode A,int k){

        while(k>0 && A!=null){
            A= A.next;
            k--;

        }
        return A;
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
}