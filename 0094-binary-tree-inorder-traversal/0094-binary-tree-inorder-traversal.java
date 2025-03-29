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
    public List<Integer> inorderTraversal(TreeNode root) {

//Morris Inorder Traversal

        TreeNode curr = root;
        List<Integer> res = new ArrayList<>();

        while(curr!=null){
            
            if (curr.left==null){
                res.add(curr.val);
                curr= curr.right;
            }else {
                TreeNode temp = curr.left;
                while (temp.right!=null && temp.right!=curr){
                    temp = temp.right;
                }
                
                if (temp.right== null){
                    temp.right =curr;
                    curr = curr.left;
                }else {
                    temp.right=null;
                    res.add(curr.val);
                    curr =curr.right;
                }
            }
            
        }
        return res;
        
    }
}