class Solution {
    public double myPow(double x, int n) {


        if(n<0){
            long nn = -1*n;
           return  1/pow(x,nn);
        }

       return pow(x,n);
   
    }

     public double pow(double x, long n) {
   
        if(n==0){
            return 1;
        }

        double P = pow(x,n/2);
        System.out.print(P+" ");

        if(n%2==0){
           
            return P*P;
        }
        else{
        
            return x*P*P;
        }


     }

}