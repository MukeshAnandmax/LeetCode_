class Solution {
    public void rotate(int[][] A) {
        int n = A.length;
        A =  transpose(A);

        for(int i=0;i<n;i++){
            int [] temp = A[i];
            reverse(temp);
        }
    }

        public void reverse(int[] temp){
        int i=0;
        int j=temp.length-1;

        while(i<=j){
            int x = temp[i];
            temp[i] = temp[j];
            temp[j] = x;
            i++;
            j--;
        }
    }

     public int[][] transpose(int[][] A) {
        
        int n= A.length;
    
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] =temp;
                }
            }
            return A;
        }
}