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
    public ListNode addTwoNumbers(ListNode A, ListNode B) {

        int carry =0;
        ListNode res = new ListNode(0);
        ListNode curr = res; 

        ListNode currA = A;
        ListNode currB = B;


        while(currA!=null || currB!=null){

            int valA = currA!=null?currA.val:0;
            int valB = currB!=null?currB.val:0;

            int sum =  valA+valB+carry; 
            carry = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            if(currA!=null){
                currA = currA.next;
            }
            if(currB!=null){
                currB = currB.next;
            }
            
           
    
        }
        if(carry!=0){
            ListNode temp = new ListNode(carry);
            curr.next = temp;
        }
        return res.next;
    }
}