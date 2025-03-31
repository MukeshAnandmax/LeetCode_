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

    boolean flag = true;
    public boolean isSymmetric(TreeNode root) {
         if(root==null){
            return false;
        }
        checkTwoSmimilarTree(root.left,root.right);
        return flag;
        
    }
    public boolean checkTwoSmimilarTree( TreeNode p,TreeNode q){

        if(p==null && q==null){
            return true;
        }
        if (p == null){
            flag = false;
            return false;
        }
        if (q == null){
            flag = false;
            return false;
        }
        if(p.val!=q.val){
            flag = false;
            return false;
        }
        return  checkTwoSmimilarTree(p.left,q.right) && checkTwoSmimilarTree(p.right,q.left);
    }
}