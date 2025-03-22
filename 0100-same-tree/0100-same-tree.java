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
    boolean result = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        return result;
    }
    public void inorder(TreeNode A,TreeNode B){
        
        if( A==null && B == null){
            return;
        }
        
        if(A==null && B!=null){
            result = false;
            return;
        }
        if(A!=null && B==null){
            result = false;
            return;
        }
        
        if(A.val !=B.val){
            result=false;
            return;
        }
        inorder(A.left,B.left);
        inorder(A.right,B.right);
        
    }
}