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


         ArrayList<Integer> res =  new ArrayList<>();
        res = inorderTraversal1(root,res);
        return res;
        
    }

     public ArrayList<Integer> inorderTraversal1(TreeNode A,ArrayList<Integer> list) {


        if(A==null){
            return list;
        }
        //System.out.print("["+A.val+"]");
        list = (inorderTraversal1(A.left,list));
        list.add(A.val);
        list = (inorderTraversal1(A.right,list));

        return list;

    }
}