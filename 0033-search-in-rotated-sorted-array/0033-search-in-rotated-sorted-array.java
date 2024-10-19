class Solution {
    public int search(int[] nums, int target) {
        
        int min = findMin(nums);
        int n= nums.length;
        System.out.print(min);  

        if(target>=nums[0]&& min>0){
            return binarySearch(nums,target,0,min-1);
        }else{
            return binarySearch(nums,target,min,n-1);
        }
       // return Math.max(binarySearch(nums,target,0,min-1), binarySearch(nums,target,min,n-1));
    }

    public int binarySearch(int[] num, int target, int l,int r){

        while(l<=r){
            int mid = l+(r-l)/2;
            if(num[mid]==target){
                return mid;
            }

            if(num[mid]>target){
                r= mid-1;
            }else{
                l=mid+1;
            }



        }


        return -1;
    }

    public int findMin(int[] nums) {

        int n= nums.length;
        int l=0;
        int r=n-1;
        while(l<=r){

            int mid = l+(r-l)/2;

            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid;
            }
            if(nums[mid]>nums[r]){
                l= mid+1;
            }else{
                r=mid-1;
            }  
        }
        return l;
    }
}