class Solution {
    public static boolean isValid(char[][] board, int i, int j, char val) {
        for (int k = 0; k < 9; k++) {
            if (board[i][k] == val)
                return false;
            if (board[k][j] == val)
                return false;

        }
        int SMrow = (i / 3) * 3;
        int SMcol = (j / 3) * 3;
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (board[SMrow + a][SMcol + b] == val)
                    return false;
            }
        }
        return true;

    }

    public static boolean solve(char[][] board, int i, int j) {
        if (i == board.length)
            return true;
        int ni = 0;
        int nj = 0;
        if (j == board[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (board[i][j] != '.') {
            if (solve(board, ni, nj))
                return true;
        } else {
            for (char val = '1'; val <= '9'; val++) {
                if (isValid(board, i, j, val)) {
                    board[i][j] = val;
                    if (solve(board, ni, nj))
                        return true;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);

    }
}