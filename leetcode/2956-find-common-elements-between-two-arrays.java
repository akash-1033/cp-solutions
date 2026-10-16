class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        int a = 0, b = 0;
        for (int i : nums1) {
            if (s2.contains(i)) {
                a++;
            }
        }
        for (int i : nums2) {
            if (s1.contains(i)) {
                b++;
            }
        }
        return new int[] { a, b };
    }
}
