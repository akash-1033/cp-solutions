class Solution {
    public int minimumDeletions(int[] nums) {
        int mn = -1, mx = -1, x = Integer.MAX_VALUE, y = Integer.MIN_VALUE, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > y) {
                y = nums[i];
                mx = i + 1;
            }
            if (nums[i] < x) {
                x = nums[i];
                mn = i + 1;
            }
        }
        int k = Math.max(mx, mn);
        mn = Math.min(mx, mn);
        mx = k;
        return Math.min(mn + (n + 1 - mx), Math.min(Math.max(mn, mx), n - Math.min(mn, mx) + 1));
    }
}
