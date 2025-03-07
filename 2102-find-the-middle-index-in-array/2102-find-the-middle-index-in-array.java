class Solution {
    public int findMiddleIndex(int[] nums) {

        int n = nums.length;
        int[] pLeftSum = new int[n];
        int[] pRightSum = new int[n];

        pLeftSum[0]= nums[0];
        pRightSum[n- 1] =nums[n-1];

        for(int i=1;i<n;i++){
            pLeftSum[i] =pLeftSum[i-1]+nums[i];
        }

        for(int i=n-2;i>=0;i--){
            pRightSum[i] = pRightSum[i+1] + nums[i];
        }

        for(int i=0;i<n;i++){
            if(pRightSum[i] == pLeftSum[i]){
                return i;
            }
        }

        return -1;
    }
}