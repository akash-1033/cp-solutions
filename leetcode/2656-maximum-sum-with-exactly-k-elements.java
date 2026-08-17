class Solution {
    public int maximizeSum(int[] nums, int k) {
        int mx = 0;
        for (int i : nums) {
            mx = Math.max(mx, i);
        }
        return (k * mx) + (((k - 1) * (k)) / 2);
    }
}
