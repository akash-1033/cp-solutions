class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            str.append((int) (s.charAt(i) - 'a' + 1));
        }
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            n += str.charAt(i) - '0';
        }
        k--;
        int q = n;
        while (k-- > 0) {
            q = sum(q);
        }
        return q;
    }

    public int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
