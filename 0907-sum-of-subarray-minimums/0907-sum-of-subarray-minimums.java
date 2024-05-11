class Solution {
    public int sumSubarrayMins(int[] A) {

        if(A.length==1){
            return A[0];
        }

        int[] prevSmaller = prevSmaller(A);
        int[] nextSmaller = nextSmaller(A);
        long res = 0;
        int mod = (int)(1e9+7);

        for(int i=0;i<A.length;i++){

            long preSmal = prevSmaller[i];
            long nxtSml = nextSmaller[i];

            long y = (nxtSml-i)*(i-preSmal);
            long p = (A[i] * y)%mod;


           res =( res +p  +mod)%mod;

        }
        return (int)res; 
    }

    public int[] prevSmaller(int[] A) {
        int[] res = new int[A.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<A.length;i++){

            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;        
            }else{
                res[i]=stack.peek();        
            } 
            stack.push(i);    
        }

        return res;
    }


      public int[] nextSmaller(int[] A){

        int[] res = new int[A.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=A.length-1;i>=0;i--){

            while(!stack.isEmpty() && A[stack.peek()]>A[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] =A.length;
            }else{
                res[i] = stack.peek();
            }
            stack.push(i);


        }
        return res;
    }
}