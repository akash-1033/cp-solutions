class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0, m = 1, k = n;
        while (n > 0) {
            s += n % 10;
            m *= n % 10;
            n /= 10;
        }
        if (k % (s + m) == 0) {
            return true;
        }
        return false;
    }
}
