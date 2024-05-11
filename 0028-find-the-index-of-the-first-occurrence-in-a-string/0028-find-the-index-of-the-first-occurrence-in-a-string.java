class Solution {
    public int strStr(String A, String B) {


        int p=29;
        int mod= 1000000007;
        long h1 =0;
        long h2 =0;
       // long count =-1;


        if(A.length()<B.length()){return -1;}

        for(int i=0;i<B.length();i++){

            h1 = (h1*p+B.charAt(i)-'a'+1)%mod;
            h2 = (h2*p+ A.charAt(i)-'a'+1)%mod;

        }

       // System.out.print(h1+" "+h2+": ");

       for (int i = 0; i <= A.length() - B.length(); i++) {
            if (h1 == h2) {
                return i;
               // res.add(i + 1);
            }
            if (i < A.length() - B.length()) {
                
             h2 = (p * (h2 - (A.charAt(i) - 'a' + 1) * pow(p,B.length()-1)) + (A.charAt(i + B.length()) - 'a' + 1)) % mod;
                if (h2 < 0) {
                    h2 = (h2 + mod);
                }   
            }
        }
        return -1;




    }


    long pow(int A, int B){

        int mod =1000000007;
        
        if(B==0){
            return 1;
        }
        
        if(B==1){
            return A;
        }

        long x = pow(A, B/2);

        if(B%2==0){
            return (x*x)%mod;
        }else{
            return (A*(x*x)%mod)%mod;
        }

    }
}