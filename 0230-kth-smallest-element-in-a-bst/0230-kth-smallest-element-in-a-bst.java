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
    public int kthSmallest(TreeNode A, int B) {
        
        int count=0;

        TreeNode curr = A;
        while(curr!=null){

            if(curr.left==null){
                count++;
                if(count==B){
                    return curr.val;
                }
                //System.out.print(curr.val);
                curr= curr.right;
            }else{
                TreeNode temp = curr.left;
                while(temp.right!=null && temp.right!=curr){
                    temp = temp.right;
                }  
                if(temp.right==null){
                    temp.right=curr;
                    curr=curr.left;
                }else{
                    temp.right=null;
                    count++;
                    if(count==B){
                        return curr.val;
                    }
                    //System.out.print(curr.val);
                    curr = curr.right;
                }
            }

        }
        return 0;
    }
}