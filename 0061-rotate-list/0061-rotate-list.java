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
    public ListNode rotateRight(ListNode A, int k) {

        if(A==null){
            return null;
        }

        ListNode slow =A;
        ListNode fast =A;

        ListNode curr= A;
        int length=0;

        while(curr!=null){
            length++;
            curr = curr.next;
        }

        k = k%length;



        while(fast!=null && k>0){
            k--;
            fast= fast.next;
        }

        // if(fast==null){
        //     return reverseList(A);
        // }

        while(fast.next!=null){
            slow= slow.next;
            fast=fast.next;
        }

        ListNode temp =slow.next;
        slow.next=null;
        ListNode firstPart = reverseList(A);
        ListNode secondPart = reverseList(temp);
        A.next =secondPart;
        ListNode finalPart = reverseList(firstPart);





        return finalPart;
        
    }

    public ListNode reverseList(ListNode A){
        
        if(A==null|| A.next==null){
            return A;
        }

        ListNode temp =reverseList(A.next);
        A.next.next=A;
        A.next= null;

        return temp;
    }
}