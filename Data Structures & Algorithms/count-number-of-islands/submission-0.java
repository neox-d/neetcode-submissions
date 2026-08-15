class Solution {

    int[] dx = {-1, 0, 0, 1};
    int[] dy = {0, -1, 1, 0};

    public void dfs(char[][] grid, int m, int n, int i, int j) {

        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return;
        }


        for (int k=0; k<4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
                grid[x][y] = '0';
                dfs(grid, m, n, x, y);
            }
        }

    }
    public int numIslands(char[][] grid) {

        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    ans++;
                    dfs(grid, m, n, i, j);
                }
            }
        }

        return ans;
    }
}
