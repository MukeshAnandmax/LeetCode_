class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> dict = new HashSet<>(wordDict);
        int n = s.length();
        Boolean[] dp = new Boolean[n];
        return solve(0, s, dict,dp);

    }


    boolean solve(int i, String str,HashSet<String> dict,Boolean[] dp) {

        if (i==str.length()) {
            return true;
        }

        if (dp[i] != null) {
            return dp[i];
        }


        for (int j=i;j< str.length();j++) {
            String word = str.substring(i,j+1);
            if (dict.contains(word)) {
                if (solve(j+1,str,dict,dp)) {
                    dp[i] = true;
                    return true;
                }
            }
        }
        dp[i] = false;
        return false;
    }
}