/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node curr =root;
        Node dummy =new Node(-1);
        Node temp = dummy;
        
        while (root!=null){
         
            if (root.left!=null){
                temp.next =root.left;
                temp = temp.next;
            }

            if (root.right!=null){
                temp.next =root.right;
                temp = temp.next;
            }
            
            root = root.next;
            
            if (root==null){
                root = dummy.next;
                dummy.next =null;
                temp =dummy;
            }
            
        }
        return curr;
    }
}