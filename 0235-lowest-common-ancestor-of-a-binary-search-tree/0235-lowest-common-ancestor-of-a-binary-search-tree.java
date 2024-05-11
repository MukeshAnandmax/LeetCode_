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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode B, TreeNode C) {
        TreeNode temp= root;
        while(temp!=null){

            if(B.val<temp.val && C.val<temp.val){
                temp = temp.left;
            }else if(B.val>temp.val && C.val>temp.val){
                temp = temp.right;
            }else{
                return temp;
            }

        }

    return null;

    }
}