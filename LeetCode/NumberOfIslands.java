class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int islands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid, int r, int c) {
        int m = grid.length;
        int n = grid[0].length;

        // Boundary or water
        if (r < 0 || r >= m ||
            c < 0 || c >= n ||
            grid[r][c] == '0') {
            return;
        }

        // Mark visited
        grid[r][c] = '0';

        // Explore 4 directions
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }
}