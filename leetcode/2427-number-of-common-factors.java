class Solution {
    public int commonFactors(int a, int b) {
        int c = 0;
        for (int i = 1; i <= Math.min(a, b) / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                c++;
            }
        }
        if (Math.max(a, b) % Math.min(a, b) == 0) {
            c++;
        }
        return c;
    }
}
