class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int s = 0;
        for (int i = 0; i < t.length; i++) {
            if (i + 1 < t.length && t[i] + d >= t[i + 1]) {
                s += t[i + 1] - t[i];
            } else {
                s += d;
            }
        }
        return s;
    }
}
