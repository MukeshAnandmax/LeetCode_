class Solution {
    int[][]dp;
    public int longestPalindromeSubseq(String S) {
        
        String s1 =S;
        String s2 = new StringBuilder(S).reverse().toString();
        int x = s1.length();
        int y = s2.length();
        
        dp = new int[x+1][y+1];
        
        // for(int[] i:dp){
        //     Arrays.fill(i,-1);
        // }
        
        return lcs1(s1,s2,x,y);
    }

     public int lcs1(String s1, String s2, int m , int n){

        for(int i=0;i<dp.length;i++ ){
            dp[i][0]=0;
        }

        for(int i=0;i<dp[0].length;i++ ){
            dp[0][i]=0;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;

                }else{
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                 
                }
            }
        }

     return dp[m][n];
    }
}