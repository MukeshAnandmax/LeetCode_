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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        hm = new HashMap<>();
        int n = inorder.length;

        for(int i=0;i<n;i++){
            hm.put(inorder[i],i);
        }

        int s1 =0;
        int e1=n-1;
        int s2=0;
        int e2= n-1;

        return BuildT(inorder,s1,e1,postorder,s2,e2);
        
    }

    public TreeNode BuildT(int[] inorder,int s1,int e1, int[] postorder,int s2, int e2 ){


        if( s1>e1){
            return null;
        }

        TreeNode root = new TreeNode(postorder[e2]);
        int idx = hm.get(postorder[e2]);
        int cnt = idx-s1;
        
        root.left = BuildT(inorder,s1,idx-1,postorder,s2,s2+cnt-1);
        root.right = BuildT(inorder,idx+1,e1,postorder,s2+cnt,e2-1);
        return root;
    }
}