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
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0){
            return null;
        }
        ListNode node =null;
        for(int i=0;i<lists.length;i++){
            node = mergeTwoLists(node,lists[i]);
        }
        return node;
    }


     public ListNode mergeTwoLists(ListNode A, ListNode B) {

         ListNode head = new ListNode(0);
        ListNode temp = head;
       // ListNode res = null;
        ListNode headA =A;
        ListNode headB=B;

        while(headA!=null && headB!=null){


            if(headA.val>headB.val){
                temp.next = headB;
                temp = temp.next;
                headB = headB.next;
            
            }else{
                temp.next = headA;
                temp = temp.next;
                headA = headA.next;
            
            }
        }   

        if(headA!=null){
            temp.next =headA;
        }
        if(headB!=null){
            temp.next=headB;
        }
        return head.next;

        
    }
}