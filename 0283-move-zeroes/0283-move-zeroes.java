class Solution {
    public void moveZeroes(int[] nums) {

        int zeroCount =0;

        for(int i:nums){
            if(i==0){
                zeroCount++;
            }
        }

        int p1=-1;
        int p2=0;
        int n = nums.length;

        while(p2<n){

            if(nums[p2]!=0){
                nums[++p1] = nums[p2++];
            }else{
                p2++;
            }
        }
        //System.out.print(zeroCount);

        while(zeroCount>0){
            nums[n-zeroCount]=0;
            zeroCount--;
        }
        
    }
}