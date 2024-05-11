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
     HashMap<Integer,Integer> hm;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
             hm =  new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        
        int s1=0;
        int s2=0;
        int e1=inorder.length-1;
        int e2 = preorder.length-1;

        return buildTree1(inorder,s1,e1,preorder,s2,e2);

    }

      public TreeNode buildTree1(int[] inorder,int s1,int e1, int[] preorder,int s2 ,int e2) {

        if(s1>e1){
            return null;
        }
        TreeNode root = new TreeNode(preorder[s2]);
        //System.out.print(preorder[s2]);

        int idx =  hm.get(preorder[s2]);
        int cnt = e1-idx;
       
        root.left=buildTree1(inorder,s1,idx-1,preorder,s2+1,e2-cnt);
        root.right=buildTree1(inorder,idx+1,e1,preorder,e2-cnt+1,e2);

        return root;
    }
}