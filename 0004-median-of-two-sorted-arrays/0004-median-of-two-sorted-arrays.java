class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        if(n>m){
            return findMedianSortedArrays(nums2,nums1);
        }
        boolean isEvenLength =  (n+m)%2==0;
        int low =  0;
        int high = n;

        while (low<=high){

            int mid  = low+(high-low)/2;
            int mid2 =  (n+m+1)/2 - mid;

            int l1= mid ==0 ? Integer.MIN_VALUE:nums1[mid-1];
            int l2= mid2 ==0 ? Integer.MIN_VALUE:nums2[mid2-1];
           
            int r1 = mid ==n ?Integer.MAX_VALUE: nums1[mid];
            int r2 = mid2 ==m ?Integer.MAX_VALUE: nums2[mid2];

         



            if(l1<=r2 && l2<=r1){
                if(isEvenLength){

                    return  (double) (Math.max(l1, l2) + Math.min(r1, r2)) /2;

                }else {
                    return Math.max(l1,l2);
                }
            }

            if(l1>r2){
                high = mid-1;
            }else {
                low = mid+1;
            }

        }
        return  -1;
    }
}