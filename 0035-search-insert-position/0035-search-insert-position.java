class Solution {
    public int searchInsert(int[] A, int B) {
         int l=0;
        int r=A.length-1;
        

        while(l<=r){

            int mid = l+ (r-l)/2;

            if(A[mid] == B){
                return mid;
            }

            if( A[mid]>B){
                r= mid-1;
            }else{
                l=mid+1;
            }

        }

       

        return l;
    }
}