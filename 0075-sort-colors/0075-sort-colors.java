class Solution {
     public void sortColors(int[] nums) {
        int n =  nums.length;
        int l=0;
        int m=0;
        int r=n-1;

        while(m<=r){
            
            if(nums[m] ==2){
                swap(nums,m,r); 
                r--;
            }else if (nums[m]==0){
                swap(nums,m,l);
                l++; m++;
            }else {
                m++;
            }
        }

    }

    public void swap(int[] nums, int i, int j){
        int n = nums[i];
        nums[i] = nums[j];
        nums[j]= n;
    }
}