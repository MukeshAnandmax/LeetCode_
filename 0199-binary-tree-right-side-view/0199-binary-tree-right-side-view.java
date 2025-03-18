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
    public List<Integer> rightSideView(TreeNode A) {

        if(A==null){
            return new ArrayList<>(); 
        }
        List<Integer>  res = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(A);

        while (!queue.isEmpty()){

            int n = queue.size();
            int temp =-1;
            for(int i=0;i<n;i++){
                TreeNode curr = queue.remove();
                if(curr.left!=null){
                    queue.add(curr.left);
                }

                if(curr.right!=null){
                    queue.add(curr.right);
                }
                temp = curr.val;
                
                
            }
            res.add(temp);
        }
        return res;
        
    }
}