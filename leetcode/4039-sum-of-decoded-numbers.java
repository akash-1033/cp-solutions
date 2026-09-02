class Solution {
    public int sumDecoded(long[] nums) {
        long p = 0;
        for (long i : nums) {
            int w = (int) (i % 10);
            long d = (long) Math.floor(i / 10);
            String s = Long.toString(d);
            String a = s.substring(0, w);
            String b = s.substring(w, s.length());
            long q = Long.valueOf(a);
            long e = Long.valueOf(b);
            long r = 1;
            while (e > 0) {
                if (e % 2 == 0) {
                    e /= 2;
                    q = (q * q) % 1000000007;
                } else {
                    e--;
                    r = (r * q) % 1000000007;
                }
            }
            p = (p + r) % 1000000007;
        }
        return (int) p;
    }
}
