class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        int n = grid.length;
        int m = grid[0].length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    dfs(grid, row, col);
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 ||
            row == grid.length || col == grid[0].length ||
            grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row, col - 1); // left
        dfs(grid, row - 1, col); // up
        dfs(grid, row, col + 1); // right
        dfs(grid, row + 1, col); // down
    }
}
