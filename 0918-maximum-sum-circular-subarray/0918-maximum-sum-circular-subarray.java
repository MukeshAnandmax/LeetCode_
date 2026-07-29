class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxKadane = KadaneMaxSum(nums);

        System.out.println(maxKadane);
        
        if(maxKadane<0) {
            return maxKadane;
        }
        
        int totalSum = 0;
        for(int i:nums) {
            totalSum = totalSum + i;
        }
        
        int minKadane = KadaneMinSum(nums);
        
        return  Math.max(maxKadane,totalSum-minKadane);

    }



    public int KadaneMaxSum(int[] nums) {
        int res = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++) {

            sum = Math.max(nums[i],sum+nums[i]);
            res = Math.max(res,sum);

        }
        return res;
    }

    public int KadaneMinSum(int[] nums) {
        int res = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++) {

            sum = Math.min(nums[i],sum+nums[i]);
            res = Math.min(res,sum);

        }
        return res;
    }


}