class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0, n = x;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return n % s == 0 ? s : -1;
    }
}
