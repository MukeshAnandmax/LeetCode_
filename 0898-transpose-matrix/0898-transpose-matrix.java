class Solution {
    public int[][] transpose(int[][] A) {
        int n= A.length;
        int m  = A[0].length;

        if(n==m){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] =temp;
                }
            }
            return A;
        }
        int[][] ans = new int[m][n];

        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    ans[j][i] = A[i][j];
                }
            }

       return ans; 
    }
}