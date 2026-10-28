class Solution {
    public int maxDigitRange(int[] nums) {
        int x = Integer.MIN_VALUE;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            int n = i;
            int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
            while (n > 0) {
                int q = n % 10;
                mx = Math.max(mx, q);
                mn = Math.min(mn, q);
                n /= 10;
            }
            int r = mx - mn;
            x = Math.max(x, r);
            mp.put(r, mp.getOrDefault(r, 0) + i);
        }
        return mp.get(x);
    }
}
