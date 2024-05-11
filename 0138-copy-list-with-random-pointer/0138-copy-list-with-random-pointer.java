/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
 
        Node temp = head;
        while(temp!=null){

            int x = temp.val;
            Node node = new Node(x);
            node.next= temp.next;
            temp.next= node;

            temp = node.next;
        }

        temp = head;

        while(temp!=null ){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            
            temp = temp.next.next;
        }


        Node res =head.next;
        temp= head;
        Node resTemp = res;
        while(resTemp.next!=null){

            temp.next = resTemp.next;
            resTemp.next= resTemp.next.next;
            resTemp = resTemp.next;
            temp= temp.next;
        }
        temp.next=null;


        return res;
        
    }
}