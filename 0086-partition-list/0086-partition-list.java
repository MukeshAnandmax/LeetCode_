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
    public ListNode partition(ListNode A, int B) {
        if(A==null || A.next==null){
            return A;
        }

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode curr = A;
        ListNode curr1=l1;
        ListNode curr2 = l2;

        while(curr!=null){

            if(curr.val<B){

                curr1.next = curr;
                curr =curr.next;
                curr1 =curr1.next;

            }else{

                curr2.next = curr;
                curr =curr.next;
                curr2 =curr2.next;

            }
        }

        curr1.next =l2.next;
        curr2.next=null;
        

        return l1.next;
        
    }
}