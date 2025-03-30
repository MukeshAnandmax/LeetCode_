/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        //https://www.youtube.com/watch?v=K_oNnoUeDJE
        // this approach is non-intutive , try finding path from root for both node and compare them to find LCA

        if(root == null || root ==p || root ==q){
           return root;
        }

       TreeNode left =  lowestCommonAncestor(root.left,p,q);
       TreeNode right = lowestCommonAncestor(root.right,p,q);
       
       if(left == null){
        return right;
       }else if(right == null){
        return left;
       }else {
        return root;
       }
        
    }
}