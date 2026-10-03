class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m = Integer.MAX_VALUE, n = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            m = Math.min(m, nums1[i]);
            n = Math.min(n, nums2[i]);
        }
        return n - m;
    }
}
