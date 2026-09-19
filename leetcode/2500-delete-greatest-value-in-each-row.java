class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
        int s = 0;
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int mx = Integer.MIN_VALUE;
            for (int[] arr : grid) {
                mx = Math.max(mx, arr[i]);
            }
            s += mx;
        }
        return s;
    }
}
