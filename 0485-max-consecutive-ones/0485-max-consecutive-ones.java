class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int p1=-1;
        int p2 = 0;
        int n = nums.length;
        int max = 0;
        while(p2<n){

            if(nums[p2] == 0){
                max = Math.max(max, p2-p1-1);
                p1=p2;
            } 
            p2++;
        }
        max = Math.max(max, p2-p1-1);
        return max;
    }
}