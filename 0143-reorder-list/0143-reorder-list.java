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
    public void reorderList(ListNode A) {

         if(A==null || A.next==null){
            return;
        }
        ListNode curr =A;
        ListNode mid = findmid(A);
        ListNode temp = reverseList(mid.next);
        mid.next =null;
        ListNode currNext =curr.next;
        ListNode tempNext = temp.next;
        while(temp!=null){

            currNext =curr.next;
            tempNext = temp.next;

            temp.next =currNext;
            curr.next=temp;
            curr =currNext;
            temp= tempNext;

        }
        return;

        
    }

    
    public ListNode reverseList(ListNode A){

        ListNode prev =null;
        ListNode curr =A;
        ListNode next = A;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }




    public ListNode findmid(ListNode A){
       
        ListNode temp = new ListNode(-1);
        temp.next=A;
         ListNode slow = temp;
        ListNode fast = temp;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}