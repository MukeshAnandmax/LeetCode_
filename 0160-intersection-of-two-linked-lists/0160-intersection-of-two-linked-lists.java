/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curr1=  headA;
        ListNode curr2=  headB;
        int c1=1;
        int c2=1;
        int diff = 0;
        
        while(curr1.next!=null){
            c1++;
            curr1 = curr1.next;
        }
        
        while(curr2.next!=null){
            c2++;
            curr2 = curr2.next;
        }
        
        diff = c1>c2?c1-c2:c2-c1;
        
        curr1 =  headA;
        curr2 =  headB;
        
        if(c1>c2){
            for(int i=0;i<diff;i++){
                curr1 = curr1.next;
            }
        }
        else{
            for(int i=0;i<diff;i++){
                curr2 = curr2.next;
            }
        }
        
        while(curr1!=null&&curr2!=null){
            
            if(curr1==curr2){
                return curr1;
            }
            
            curr2 = curr2.next;
            curr1 = curr1.next;
            
        }
        
        
        
        
        return null;
    }
}