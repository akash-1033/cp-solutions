class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double mn = (double) 51.00;
        for (int i = 0; i < nums.length / 2; i++) {
            mn = Math.min(mn, (double) (nums[nums.length - i - 1] + nums[i]) / 2);
        }
        return mn;
    }
}
