class Solution {
    public int maxProduct(int[] nums) {
         int res = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for(int i=1;i<nums.length;i++) {

            int prevMax = maxEndingHere;
            int prevMin = minEndingHere;

            maxEndingHere = Math.max(nums[i],Math.max(nums[i]*prevMax,nums[i]*prevMin));
            minEndingHere = Math.min(nums[i],Math.min(nums[i]*prevMax,nums[i]*prevMin));


            res = Math.max(res,maxEndingHere);

        }

        return res;

    }
}