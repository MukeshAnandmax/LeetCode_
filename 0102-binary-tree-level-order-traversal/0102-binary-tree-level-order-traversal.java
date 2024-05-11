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
    public List<List<Integer>> levelOrder(TreeNode A) {

        if(A==null){
            return  new  ArrayList<>();
        }

        List<List<Integer>> res = new  ArrayList<>();
        ArrayDeque<TreeNode> queue =  new ArrayDeque<>();
        queue.add(A);

        while( !queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();

            for( int i=0;i<n;i++){

                TreeNode temp = queue.remove();

                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }

                list.add(temp.val);
            }
            res.add(list);
        }


        return res;
        
    }
}