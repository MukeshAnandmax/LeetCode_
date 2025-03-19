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
        public List<List<Integer>> verticalTraversal(TreeNode root) {

        if(root ==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res  =  new ArrayList<>();
        ArrayDeque<Pair> queue =  new ArrayDeque<>();
        Map<Integer,List<int[]>> hm = new HashMap<>();
        Pair rootNode =  new Pair(0, root);
        queue.add(rootNode);
        int max =  0;
        int min  = 0;
        int depth =0;

        while (!queue.isEmpty()){

            int n = queue.size();
            depth++;
            for(int i=0;i<n;i++){

                Pair currPair = queue.remove();

                int currLevel = currPair.level;
                TreeNode currNode  = currPair.node;
                System.out.println(currNode.val+"-");

                hm.putIfAbsent(currLevel,new ArrayList<>());
                hm.get(currLevel).add(new int[]{depth, currNode.val});


                if(currNode.left!=null){
                    queue.add( new Pair(currLevel-1,currNode.left));
                    min = Math.min(min,currLevel-1);
                }
                if(currNode.right!=null){
                    queue.add( new Pair(currLevel+1,currNode.right));
                    max =  Math.max(max,currLevel+1);
                }


            }

        }

        for (int i = min; i <= max; i++) {
            List<int[]> list = hm.get(i);
            if (list != null) {
                Collections.sort(list, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
                List<Integer> current = new ArrayList<>();
                for (int[] num : list) {
                    current.add(num[1]);
                }
                res.add(current);
            }
        }
        
        return  res;
    }
    public static class Pair{
        int level;
        TreeNode node;

        public Pair(int level, TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }
}