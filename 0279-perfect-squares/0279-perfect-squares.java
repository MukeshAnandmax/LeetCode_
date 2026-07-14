class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return countMinSquares1(n, dp);
        
    }

    public int countMinSquares1(int A,int[] dp) {

        if (A == 0|| A == 1) {
            return A;
        }
        
        if (dp[A] != -1) {
            return dp[A];
        }

        int x = (int) Math.sqrt((double) A);

        int res = Integer.MAX_VALUE;

        for (int i = x; i > 0; i--) {
            if (i * i <= A) {
                res = Math.min(res, 1 + countMinSquares1(A - (i * i),dp));
            }
        }
        dp[A] = res;
        return dp[A];

    }
}