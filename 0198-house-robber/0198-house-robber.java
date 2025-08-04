class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n =nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return houseRobber(nums,n);
    }

    public static int houseRobber(int[] nums, int n) {
        //[1,2,3,1]
        if(n<=0){
            return 0;
        }

        if(n==1){
            return nums[0];
        }

      
        if(dp[n-1]==-1){
            dp[n-1]=houseRobber(nums,n-1);
        }
        if(dp[n-2]==-1){
            dp[n-2]=houseRobber(nums,n-2);
        }

        return  Math.max( dp[n-2] + nums[n-1], dp[n-1] );

    }
}