class Solution {
    public int largestRectangleArea(int[] A) {


          long area =0;
        int[] nextSmaller = nextSmaller(A);
        int[] prevSmaller = prevSmaller(A);
        for(int i=0;i<A.length;i++){

            long rightSmaller = nextSmaller[i];
            long leftSmaller =  prevSmaller[i];

           long tempArea =  (long)A[i]*(rightSmaller-leftSmaller-1);

           area = Math.max(tempArea,area);

        }



        return (int)area;
        
    }

    
    public int[] nextSmaller(int[] A){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] res =  new int[A.length];

        for(int i =A.length-1;i>=0;i--){

            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = A.length;
            }else{
                res[i] = stack.peek();

            }

            stack.push(i);
        }
        return res;
    }


     public int[] prevSmaller(int[] A){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] res =  new int[A.length];

        for(int i=0;i<A.length;i++){

            while(!stack.isEmpty() && A[stack.peek()]>=A[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek();

            }

            stack.push(i);
        }
        return res;
    }
}