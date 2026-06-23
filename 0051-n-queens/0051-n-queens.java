class Solution {
    public List<List<String>> solveNQueens(int n) {

        Set<Integer> coulmnSet = new HashSet<>();
        Set<Integer> diagonalSet = new HashSet<>();
        Set<Integer> antiDiagonalSet = new HashSet<>();
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];

        for(char[] rows: board){
            Arrays.fill(rows, '.');
        }
        nQueens(n,0,board,coulmnSet,diagonalSet,antiDiagonalSet,res);

        return res;
        
    }

    public void nQueens(int n, int currRow, char[][] board,Set<Integer> coulmnSet,Set<Integer> diagonalSet,Set<Integer> antiDiagonalSet, List<List<String>> res){

        if(currRow == n){
         prepareResult(board,res);
         return;
        }

        for(int i=0;i<n;i++){

            if(!coulmnSet.contains(i) && !diagonalSet.contains(currRow-i) && !antiDiagonalSet.contains(currRow+i)){
                
                coulmnSet.add(i);
                diagonalSet.add(currRow-i);
                antiDiagonalSet.add(currRow+i);

                board[currRow][i] = 'Q';

                nQueens(n,currRow+1,board,coulmnSet,diagonalSet,antiDiagonalSet,res);

                coulmnSet.remove(i);
                diagonalSet.remove(currRow-i);
                antiDiagonalSet.remove(currRow+i);

                board[currRow][i] = '.';

            }


        }


    }


    public void prepareResult(char[][] board,List<List<String>> res){
        List<String> temp = new ArrayList<>();
        for(char[] rows : board){
            temp.add(new String(rows));
        }
        res.add(temp);
    }
}