class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp =  new ArrayList<>();
        subset2(nums,0,temp,res);
        return res;
        
    }

    public void subset2(int[] A, int currIdx,List<Integer> result,List<List<Integer>> subsets){

        subsets.add(new ArrayList<>(result));

        for(int i=currIdx; i<A.length; i++) {

            if(i>currIdx&& A[i]==A[i-1]){continue;}

            result.add(A[i]);
            subset2(A, i + 1, result, subsets);
            result.remove(result.size() - 1);
        }

    }
}