class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums) {
            st.add(i);
        }
        for (int i = k;; i += k) {
            if (!st.contains(i)) {
                return i;
            }
        }
    }
}
