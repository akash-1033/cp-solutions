class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int i = 0, j = 0, mx = 0;
        while (j < nums.length) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            while (i < j && mp.get(nums[j]) > k) {
                mp.put(nums[i], mp.get(nums[i]) - 1);
                i++;
            }
            mx = Math.max(mx, j - i + 1);
            j++;
        }
        return mx;
    }
}
