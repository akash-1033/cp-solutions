class Solution {
    public int wateringPlants(int[] p, int c) {
        int s = 0, k = c;
        for (int i = 0; i < p.length; i++) {
            if (p[i] <= c) {
                s++;
            } else {
                s += 2 * (i + 1) - 1;
                c = k;
            }
            c -= p[i];
        }
        return s;
    }
}
