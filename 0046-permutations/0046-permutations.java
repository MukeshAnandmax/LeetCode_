class Solution {
       public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        permute2(res,temp,nums,nums.length,visited);
        return res;
        
        
    }

    public void permute2(List<List<Integer>> res, List<Integer> temp, int[] nums, int n, boolean[] visited){ 

        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i =0;i< n;i++){
            if (!visited[i]){
                visited[i] = true;
                temp.add(nums[i]);
                permute2(res,temp,nums,n,visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }



    }
}