class Solution {

    public int traverse(int i, int j, int m, int n, int[][] dp) {

        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) return dp[i][j];

        int ans1 = traverse(i + 1, j, m, n, dp);
        int ans2 = traverse(i, j + 1, m, n, dp);

        return dp[i][j] = ans1 + ans2;
    }

    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        for (int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return traverse(0, 0, m, n, dp);
    }
}
