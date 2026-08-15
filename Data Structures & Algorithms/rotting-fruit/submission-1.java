class Solution {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int orangesRotting(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> pq = new ArrayDeque<>();
        int fresh = 0;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 2) {
                    pq.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int ans = 0;

        while (fresh > 0 && !pq.isEmpty()) {
            int size = pq.size();
            for (int z=0; z<size; z++) {
                int[] curr = pq.poll();

                for (int i=0; i<4; i++) {
                    int x = curr[0] + dx[i];
                    int y = curr[1] + dy[i];

                    if (x >= 0 && y >=0 && x < n && y < m && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        pq.add(new int[]{x, y});
                        fresh--;
                    }
                }
            }            
            ans++;
        }

        return fresh == 0 ? ans : -1;

    }
}
