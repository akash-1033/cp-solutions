class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] grid = new int[8][8];
        for (int[] q : queens) {
            grid[q[0]][q[1]] = -1;
        }
        grid[king[0]][king[1]] = 1;
        List<List<Integer>> res = new ArrayList<>();
        for (int[] q : queens) {
            if (valid(grid, q)) {
                List<Integer> ans = new ArrayList<>();
                ans.add(q[0]);
                ans.add(q[1]);
                res.add(ans);
            }
        }
        return res;
    }

    public boolean valid(int[][] grid, int[] q) {
        grid[q[0]][q[1]] = 0;
        int r = q[0];
        int c = q[1];
        for (int i = r - 1; i >= 0; i--) {
            if (grid[i][c] == -1) {
                break;
            }
            if (grid[i][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
        }
        for (int i = r + 1; i < 8; i++) {
            if (grid[i][c] == -1) {
                break;
            }
            if (grid[i][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
        }
        for (int j = c - 1; j >= 0; j--) {
            if (grid[r][j] == -1) {
                break;
            }
            if (grid[r][j] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
        }
        for (int j = c + 1; j < 8; j++) {
            if (grid[r][j] == -1) {
                break;
            }
            if (grid[r][j] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
        }
        r = q[0] - 1;
        c = q[1] - 1;
        while (r >= 0 && c >= 0) {
            if (grid[r][c] == -1) {
                break;
            }
            if (grid[r][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
            r--;
            c--;
        }
        r = q[0] + 1;
        c = q[1] + 1;

        while (r < 8 && c < 8) {
            if (grid[r][c] == -1) {
                break;
            }
            if (grid[r][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
            r++;
            c++;
        }
        r = q[0] + 1;
        c = q[1] - 1;
        while (r < 8 && c >= 0) {
            if (grid[r][c] == -1) {
                break;
            }
            if (grid[r][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
            r++;
            c--;
        }
        r = q[0] - 1;
        c = q[1] + 1;
        while (r >= 0 && c < 8) {
            if (grid[r][c] == -1) {
                break;
            }
            if (grid[r][c] == 1) {
                grid[q[0]][q[1]] = -1;
                return true;
            }
            r--;
            c++;
        }
        grid[q[0]][q[1]] = -1;
        return false;
    }
}
