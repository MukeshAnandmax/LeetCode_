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
    int res ;
    public int diameterOfBinaryTree(TreeNode root) {

        //https://www.youtube.com/watch?v=zM9N_x_v_24
        res = Integer.MIN_VALUE;
        solve(root);
        return res;
        
    }

     public int solve(TreeNode root) {

        if( root== null ){
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);
        res =  Math.max(res, left+right);


        return Math.max(left,right)+1;
    }
}