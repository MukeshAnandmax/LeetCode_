class Solution {
    public int findPairs(int[] A, int B) {
        
        
        Arrays.sort(A);

        int low =0;
        int high =1;
        int count =0;

        while(high<A.length && low <A.length){

            int diff =  A[high]-A[low]>0 ?  A[high]-A[low]:  A[low]-A[high];

            if(diff == B  && low!=high){
                count++;

                while(low<A.length-1 && A[low+1] == A[low]){
                    low++;
                }

                 while(high<A.length-1 && A[high+1] == A[high]){
                    high++;
                }

              //  high++;
                //System.out.print(count+" "+high+" ");
            }
            if( diff >B  ){
                low++;
            }else{
                high++;
            }
        }

        return count;





    }
}