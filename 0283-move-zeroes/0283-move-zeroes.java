class Solution {
    public void moveZeroes(int[] nums) {

        int p1 =-1;
        int p2 =0;

        int n =nums.length;

        while(p2<n){
            if(nums[p2]!=0){
                int temp = nums[++p1];
                nums[p1] = nums[p2];
                nums[p2++] =temp;
            }else{
                p2++;
            }
        }
        
    }
}