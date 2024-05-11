class Solution {
    public int maxArea(int[] A) {


        
        int maxArea = 0;
        int low=0;
        int high = A.length-1;

        while(low<high){

            int min =  Math.min(A[low],A[high]);
            int area = min*(high-low);

            maxArea = Math.max(area,maxArea);

            if(A[low]<A[high]){
                low++;
            }else{
                high--;
            }


        }
        return maxArea;
        
    }
}