class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] hash = new int[10];
        while (n > 0) {
            hash[n % 10]++;
            n /= 10;
        }
        int mn = Integer.MAX_VALUE, q = -1;
        for (int i = 0; i < 10; i++) {
            if (hash[i] > 0) {
                if (hash[i] < mn) {
                    mn = hash[i];
                    q = i;
                }
            }
        }
        return q;
    }
}
