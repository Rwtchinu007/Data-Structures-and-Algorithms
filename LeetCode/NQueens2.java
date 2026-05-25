class Solution {

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        return findingCount(n, board, 0);
    }

    private int findingCount(int n, char[][] board, int row) {

        if (row == n) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {

            if (isValid(n, board, row, col)) {

                board[row][col] = 'Q';

                count += findingCount(n, board, row + 1);

                board[row][col] = '.';
            }
        }

        return count;
    }

    private boolean isValid(int n, char[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}