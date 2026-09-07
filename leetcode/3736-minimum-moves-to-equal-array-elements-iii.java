class Solution {
    public int minMoves(int[] nums) {
        int mx = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > mx) {
                c += (nums[i] - mx) * i;
                mx = nums[i];
            } else {
                c += mx - nums[i];
            }
        }
        return c;
    }
}
