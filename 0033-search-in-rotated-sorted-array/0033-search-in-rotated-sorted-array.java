class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length-1;

        int pivot = findPivot(nums, 0, n);
        System.out.println(pivot);

        
        if(nums[0]<=target && pivot>0){
            return bSearch(nums,target,0 ,pivot-1);
        }else {
            return bSearch(nums,target,pivot,n);
        }
        
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



    public  int bSearch( int[] nums, int target, int low, int high){

        if(low>high){
            return  -1;
        }
        int mid  = low+(high-low)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
           high = mid-1;
           return bSearch(  nums,  target,  low,  high);
        }else {
            low=mid+1;
            return bSearch(  nums,  target,  low,  high);
        }
    }

    
}