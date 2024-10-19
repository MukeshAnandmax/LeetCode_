class Solution {
    public int findMin(int[] nums) {

        int n = findPivot(nums,  0,  nums.length-1);
        return nums[n];
        
    }

    
    public int findPivot(int[] nums, int low, int high){

        if(low>high){
            return -1;
        }

        int pivot =0;
        int temp =-1;

        int mid  = low+(high-low)/2;

        if(mid>0 && nums[mid] <nums[mid-1] ){
            return mid;
        }
        
        if(nums[mid]<nums[0]){

            pivot = mid;
            high = mid-1;
            temp  = findPivot( nums,  low,  high);
            pivot=temp!=-1?temp:pivot;
           
        }else{
            low= mid+1;
            temp = findPivot( nums,  low,  high);
        }

        pivot=temp!=-1?temp:pivot;
        return pivot;
    }

}