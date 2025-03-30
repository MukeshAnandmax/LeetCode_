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
     public List<String> binaryTreePaths(TreeNode root) {

        if (root==null){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder =  new StringBuilder();
       // stringBuilder.append(root.val);
        treePaths(root,res,stringBuilder);
        return res;
    }

    public void treePaths(TreeNode root, List<String> res, StringBuilder sb){
         if(root==null){
            return;
        }

        int len = sb.length();
        if(sb.isEmpty()){
            sb.append(root.val);
        }else {
            sb.append("->").append(root.val);
        }

        if (root.left==null && root.right==null){
            res.add(new String(sb));
        }

        treePaths(root.left,res,sb);
        treePaths(root.right,res,sb);
        sb.delete(len,sb.length());

    }

}