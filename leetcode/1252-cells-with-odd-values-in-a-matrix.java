class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] arr : indices) {
            rows[arr[0]]++;
            cols[arr[1]]++;
        }
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 == 1) {
                    c++;
                }
            }
        }
        return c;
    }
}
