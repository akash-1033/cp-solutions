class Solution {
    public int countEven(int num) {
        int x = 0;
        for (int i = 1; i <= num; i++) {
            int s = 0, q = i;
            while (q > 0) {
                s += q % 10;
                q /= 10;
            }
            if (s % 2 == 0) {
                x++;
            }
        }
        return x;
    }
}
