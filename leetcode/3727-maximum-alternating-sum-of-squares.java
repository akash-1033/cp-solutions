class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long s = 0;
        for (int i = 0; i < n / 2; i++) {
            s += (long) (Math.pow(nums[n - i - 1], 2)) - (long) (Math.pow(nums[i], 2));
        }
        return n % 2 == 1 ? s + (long) Math.pow(nums[n / 2], 2) : s;
    }
}
