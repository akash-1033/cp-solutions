class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int n = low; n <= high; n++) {
            int k = n;
            String str = String.valueOf(k);
            if (str.length() % 2 == 1) {
                continue;
            }
            int a = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                a += k % 10;
                k /= 10;
            }
            int b = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                b += k % 10;
                k /= 10;
            }
            if (a == b) {
                c++;
            }
        }
        return c;
    }
}
