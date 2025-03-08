class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp  = new int[m+n];

        int p1=0,p2=0;
        int i=0;

        while(p1<m && p2<n ){

            if(nums1[p1]>nums2[p2]){

                temp[i++] = nums2[p2++];
            }else{
                temp[i++] = nums1[p1++];
            }

        }

        while(p1<m){
            temp[i++] = nums1[p1++];
        }

        while(p2<n){
            temp[i++] = nums2[p2++];
        }

        for(int j=0;j<m+n;j++){
            nums1[j] =temp[j];
        }
        
    }
}