class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int s = -1, k = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int q = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (q < k) {
                    k = q;
                    s = i;
                }
            }
        }
        return s;
    }
}
