class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c = -1;
        for (int i : nums) {
            if (c == -1 && i == 1) {
                c = 0;
            } else if (c != -1 && i == 1) {
                if (c < k) {
                    return false;
                }
                c = 0;
            } else if (c != -1) {
                c++;
            }
        }
        return true;
    }
}
