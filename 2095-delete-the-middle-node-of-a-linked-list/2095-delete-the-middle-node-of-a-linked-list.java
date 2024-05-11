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
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null){
            return null;
        }     
        ListNode curr = head;
        int midLength = length(head)/2;
        midLength--;
        while(midLength>0){
            curr=curr.next;
            midLength--;

        }

        curr.next = curr.next.next;


        return head;
        
    }
    public int length(ListNode A){
        ListNode curr =A;
        int length=0;
         while(curr!=null){
             length++;
             curr= curr.next;
         }

         return length; 
    }

    
}