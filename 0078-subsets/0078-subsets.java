class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> finalResult = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        subsets1(nums,finalResult,result,0);


        return finalResult;
    }

    public void subsets1(int[] nums,List<List<Integer>> finalResult,List<Integer> result, int currIdx) {

        if(currIdx == nums.length){
            finalResult.add(new ArrayList(result));
            //result = new ArrayList();
            return;
        }

        result.add(nums[currIdx]);
        subsets1(nums,finalResult,result,currIdx+1);
        result.remove(result.size()-1);

        subsets1(nums,finalResult,result,currIdx+1);

    }
}