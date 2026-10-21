class Solution {
    public boolean validDigit(int n, int x) {
        int c = 0;
        while (n > 9) {
            if (n % 10 == x) {
                c = 1;
            }
            n /= 10;
        }
        if (n % 10 == x) {
            c = 0;
        }
        return c == 0 ? false : true;
    }
}
