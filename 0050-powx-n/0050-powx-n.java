class Solution {
    public double myPow(double x, int n) {

        if(n<0){
            return myPow1(1/ x,  n);
        }
        return myPow1(x,  n);
    }
    public double myPow1(double x, int n) {

        if(n==0){
            return 1;
        }
        double halfPower = myPow1(x,n/2);

        if(n%2==0){
            return halfPower*halfPower;
        }else{
            return halfPower*halfPower*x;
        }
        
    }
}