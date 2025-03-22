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
    public int widthOfBinaryTree(TreeNode root) {
        
            if(root==null){
                return 0;
            }
            Queue<Pair1> queue = new LinkedList<>();
            queue.offer(new Pair1(0,root));
            int res =0;
            while (!queue.isEmpty()){
                int n = queue.size();
                int startIndex = queue.peek().index;
                int currIndex =0;
                for(int i=0;i<n;i++){

                    Pair1 currPair = queue.poll();
                    assert currPair != null;
                    currIndex =  currPair.index;
                    TreeNode currNode = currPair.node;

                    //System.out.println((currNode!=null)?currNode.val:"Null");

                    if(currNode.left!=null){
                        queue.offer(new Pair1(currIndex*2,currNode.left));

                    }
                    if(currNode.right!=null){
                        queue.offer(new Pair1((currIndex*2)+1 ,currNode.right));

                    }

                }

                res  = Math.max(res, currIndex-startIndex+1);

                //System.out.println("min:"+minIndex+" max: "+maxIndex+" res : "+res);

            }

            return res;

    }

    public static class Pair1{
        int index;
        TreeNode node;

        public Pair1(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }
}