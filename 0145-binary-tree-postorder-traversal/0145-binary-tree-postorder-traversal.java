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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = postorderTraversal1(root,list);

        return list;
        
    }

     public ArrayList<Integer> postorderTraversal1(TreeNode A,      ArrayList<Integer> list) {
         if(A==null){
             return list;
         }
         list = postorderTraversal1(A.left,list);
         list = postorderTraversal1(A.right,list);
         list.add(A.val);

         return list;
    }
}