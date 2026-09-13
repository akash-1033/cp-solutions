class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] hash = new int[101];
        for (int i : nums) {
            hash[i]++;
        }
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hash[nums[i]] == 3) {
                hash[nums[i]] = -1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        int k = (2 * j) - i;
                        if (k < nums.length && nums[k] == nums[i]) {
                            c++;
                        }
                        break;
                    }
                }
            }
        }
        return c;
    }
}
