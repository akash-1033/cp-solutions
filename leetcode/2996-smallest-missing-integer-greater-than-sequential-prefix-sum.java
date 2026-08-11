class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> st = new HashSet<>();
        st.add(nums[0]);
        int s = nums[0], c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (c == 0 && nums[i] == nums[i - 1] + 1) {
                s += nums[i];
            } else {
                c = 1;
            }
            st.add(nums[i]);
        }
        while (st.contains(s)) {
            s++;
        }
        return s;
    }
}
