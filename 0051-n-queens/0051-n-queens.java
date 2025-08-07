class Solution {
        Set<Integer> colSet, dig1Set, dig2Set;

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] mat = new char[n][n];
        for (char[] row : mat) Arrays.fill(row, '.');

        colSet = new HashSet<>();
        dig1Set = new HashSet<>();
        dig2Set = new HashSet<>();

        NQueen(mat, n, 0, res);

        return res;
    }

    private void NQueen(char[][] mat, int n, int row, List<List<String>> res) {
        if (row == n) {
            res.add(copyToResult(mat));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                mat[row][col] = 'Q';
                colSet.add(col);
                dig1Set.add(row + col);
                dig2Set.add(row - col);

                NQueen(mat, n, row + 1, res);

                // backtrack
                mat[row][col] = '.';
                colSet.remove(col);
                dig1Set.remove(row + col);
                dig2Set.remove(row - col);
            }
        }
    }

    private boolean isSafe(int row, int col) {
        return !(colSet.contains(col) || dig1Set.contains(row + col) || dig2Set.contains(row - col));
    }

    private List<String> copyToResult(char[][] mat) {
        List<String> res = new ArrayList<>();
        for (char[] chars : mat) {
            res.add(new String(chars));
        }
        return res;
    }

}