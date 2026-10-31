class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            if (i - k >= 0 && nums[i - k] >= nums[i]) {
                x = -1;
            }
            if (i + k < nums.length && nums[i + k] >= nums[i]) {
                x = -1;
            }
            if (x == 1) {
                s += nums[i];
            }
        }
        return s;
    }
}
