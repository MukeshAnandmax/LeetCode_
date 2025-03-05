class Solution {
    public boolean check(int[] nums) {
        int invCount =0;
        int n = nums.length;
        if(n==0 || n==1){
            return true;
        }


        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                invCount++;
                if(invCount>1){
                    return false;
                }
            }
        }
        if(nums[n-1]>nums[0]){
                invCount++;
                if(invCount>1){
                    return false;
                }
        }

        System.out.println(invCount);
        return invCount<=1;
    }
}