class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            mx = Math.max(mx, Math.max(nums[i] - nums[i + 1], nums[i + 1] - nums[i]));
        }
        return Math.max(mx, Math.max(nums[0] - nums[nums.length - 1], 
        nums[nums.length - 1] - nums[0]));
    }
}
