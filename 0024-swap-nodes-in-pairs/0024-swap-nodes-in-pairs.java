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
    public ListNode swapPairs(ListNode A) {

        
        if(A==null || A.next==null){
            return A;
        }
        ListNode tempHead = new ListNode(0);
        ListNode curr = tempHead;
        tempHead.next = A;

        while(curr.next!=null && curr.next.next!=null){

            ListNode temp = curr.next.next;
            curr.next.next = temp.next;
            temp.next= curr.next;
            curr.next = temp;
            curr = curr.next.next;
  
        }

    
        return tempHead.next;
        
    }
}