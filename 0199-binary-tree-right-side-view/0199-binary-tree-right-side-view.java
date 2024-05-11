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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null ){
            return res;
        }

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while(!queue.isEmpty()){

            int n = queue.size();
            int tempval =-1;

            for(int i=0;i<n;i++){
                TreeNode temp = queue.remove();

                if(temp.left!=null){
                    queue.add(temp.left);
                }

                if(temp.right!=null){
                    queue.add(temp.right);
                }
                tempval =  temp.val;
            }
            res.add(tempval);
        }


        return res;
    }
}