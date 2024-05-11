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
    
    
    
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null&&head.next == null )
            return head;
        
        while(fast.next!=null&&fast.next.next!=null){
            
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        
        
        return slow;
    }
    
    ListNode reverse(ListNode curr){
        
        //Node curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            
            prev = curr;
            curr = next;
            
        }
        
        return prev;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMiddle( head);
        ListNode  rev = reverse(mid.next);
        ListNode curr = head;
        while(rev!=null){
            if(curr.val!=rev.val)
                return false;
            curr = curr.next;
            rev = rev.next;
        }
        
        
        return true;
        
    }
}