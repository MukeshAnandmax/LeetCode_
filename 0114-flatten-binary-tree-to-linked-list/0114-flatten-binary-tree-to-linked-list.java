/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public void flatten(TreeNode root) {

        if (root==null){
            return;
        }
        ArrayDeque<TreeNode> stack =new ArrayDeque<>();
        flattenTree(root,stack);
        TreeNode curr= stack.pop();
        
        while (!stack.isEmpty()){
            
            curr.right =stack.pop();
            curr.left=null;
            curr = curr.right;
            
        }
    }
    public void flattenTree(TreeNode root,ArrayDeque<TreeNode> stack) {

        if (root==null){
            return;
        }
        flattenTree(root.right,stack);
        flattenTree(root.left,stack);
        stack.push(root);
    }
}