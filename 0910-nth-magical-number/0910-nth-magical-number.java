class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        int mod  = (int)1e9+7;
        long low  =  (long)Math.min(a,b);
        long high = (long)n*low;

        return (int)  (bSearch(n,a,b, low ,  high)%mod);

    }



    public long bSearch(int n,int a, int b,long low , long high){

        if(low>high){
            return -1;
        }
       
       
        long mid  = low +(high - low )/2;
         long lcm = lcm(a, b);
    
       
        int count = (int)( (mid /a) +(mid/b) -(mid/lcm));

        if(count ==n){
           
            high = mid-1;
            long temp =bSearch(n,a,b, low ,  high);
            return (temp!=-1)?temp:mid;
            

        }
        if(count>n){
            high = mid-1;
            return bSearch(n,a,b, low ,  high);
        }else{
            low = mid+1;
            return  bSearch(n,a,b, low ,  high);
        }

        

    }

    public long lcm(long a, long b){

        return a*b/gcd(a,b);

    }
    public long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}