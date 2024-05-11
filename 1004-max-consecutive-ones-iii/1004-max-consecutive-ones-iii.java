class Solution {
    public int longestOnes(int[] A, int B) {
        
        int left =0;
        int right =0;
        int i=0;
        int j=0;
        int x=0;
        int zeroCount=0;
        int maxLength =Integer.MIN_VALUE;
        while(right<A.length){

            if(A[right]==0){
                zeroCount++;
                x++;
            }
            if(zeroCount>B){

                while(zeroCount>B){
                    if(A[left]==0){
                        zeroCount--;
                    }
                    left++;
                }  
            }else{
                  if( maxLength<(right-left+1) ){
                    i=left;
                    j=right;
                    maxLength =(right-left+1);
                }
               
                   
            }    
             right++;             
        }

        if(x== A.length){
            return B;
        }
        return j-i+1;

    }
}