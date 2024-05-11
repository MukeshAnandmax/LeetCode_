class Solution {
    public int candy(int[] A) {

         int[] res =  new int[A.length];
        int sum =0;

        Arrays.fill(res,1);
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                res[i]= res[i-1]+1;
            }
        }
        for(int i=A.length-2;i>=0;i--){
            
            if(A[i]>A[i+1]){
                res[i] =  Math.max(res[i], res[i+1]+1);
            }
        }


        for(int i:res){
            sum+=i;
        }
        return sum;
        
    }
}