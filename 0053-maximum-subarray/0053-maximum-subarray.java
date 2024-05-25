class Solution {
    public int maxSubArray(int[] nums) {
        
        //https://www.geeksforgeeks.org/batch/dsa-4/track/DSASP-Arrays/video/MTQwMg%3D%3D
        
        int maxSum =Integer.MIN_VALUE;
        int maxSumEnding=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            maxSumEnding = Math.max(maxSumEnding+nums[i],nums[i]);
            maxSum =  Math.max(maxSumEnding,maxSum);
        }
        return maxSum;
    }
}