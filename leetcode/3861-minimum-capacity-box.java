class Solution {
    public int minimumIndex(int[] cp, int it) {
        int x = -1;
        for (int i = 0; i < cp.length; i++) {
            if (cp[i] >= it) {
                if (x == -1) {
                    x = i;
                } else if (cp[i] < cp[x]) {
                    x = i;
                }
            }
        }
        return x == Integer.MAX_VALUE ? -1 : x;
    }
}
