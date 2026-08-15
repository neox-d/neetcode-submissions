class Solution {

    public int countWays(int i, int n, int[] dp) {
        if (i >= n -1) {
            return 1;
        }

        if (dp[i] != -1) return dp[i];

        int ans1 = countWays(i + 1, n, dp);
        int ans2 = countWays(i + 2, n, dp);

        return dp[i] = ans1 + ans2; 
    }


    public int climbStairs(int n) {
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            dp[i] = -1;
        }
        dp[n - 1] = countWays(0, n, dp);
        return dp[n - 1];
    }
}
