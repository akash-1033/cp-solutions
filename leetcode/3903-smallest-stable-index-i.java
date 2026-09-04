class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] mx = new int[n];
        mx[0] = nums[0];a
        int[] mn = new int[n];
        mn[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            mx[i] = Math.max(mx[i - 1], nums[i]);
            mn[n - i - 1] = Math.min(mn[n - i], nums[n - i - 1]);
        }
        for (int i = 0; i < n; i++) {
            if (mx[i] - mn[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}
