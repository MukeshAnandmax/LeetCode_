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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root== null){
            return res;
        }
        int level =1;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while( !queue.isEmpty()){
            List<Integer> ls =  new ArrayList<>();
            int n = queue.size();

            for(int i=0;i<n;i++){
                TreeNode temp = queue.remove();

                if(temp.left!=null){
                    queue.add(temp.left);
                }

                if(temp.right!=null){
                    queue.add(temp.right);
                }

                ls.add(temp.val);
            }
            if(level%2==0){
                Collections.reverse(ls);
            }
            res.add(ls);
            level++;
        }

        return res;
    }
}