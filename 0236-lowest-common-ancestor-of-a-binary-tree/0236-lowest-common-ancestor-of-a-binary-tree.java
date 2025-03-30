/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        ArrayList<TreeNode> leftPath = new ArrayList<>();
        ArrayList<TreeNode> rightPath = new ArrayList<>();

        pathToNode(root,p,leftPath);
        pathToNode(root,q,rightPath);

        int minSize = Math.min(leftPath.size(),rightPath.size());
        TreeNode res = null;
        for(int i=0;i<minSize;i++){
            if (leftPath.get(i) == rightPath.get(i)){
                res = leftPath.get(i);
            }else {
                break;
            }
            
        }
        return res;
    }

    public boolean pathToNode(TreeNode root, TreeNode p, ArrayList<TreeNode> list){

        if (root==null){
            return false;
        }
        list.add(root);

        if(root ==p){
            return true;
        }

        if(pathToNode(root.left, p, list)|| pathToNode(root.right, p, list)){
            return  true;
        }
         list.remove(list.size()-1);
        return false;

    }
}