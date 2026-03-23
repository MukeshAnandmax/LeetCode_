class Solution {
    public int countElements(int[] A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = A.length;
        int count =0;


        for(int i=0;i<n;i++){
            
            if(A[i]>max){
                max = A[i];
            }

            if(A[i]<min){
                min = A[i];
            }
        }

        for(int i=0;i<n;i++){

            if(A[i]>min && A[i]<max){
                count++;
            }

        }

        return count;
        
    }
}