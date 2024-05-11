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
    public ListNode reverseList(ListNode head) {
        
     if(head == null){return null;}
        
    if(head.next == null){
        return head;
    }
    
    
    ListNode prev = reverseList(head.next);
    
    //SinglyLinkedListNode curr = head;
    head.next.next = head;
    head.next= null;
        
    return prev;
    
        
    }
}