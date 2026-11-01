class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] hash1 = new int[101];
        for (int i : nums1) {
            if (hash1[i] < 1) {
                hash1[i]++;
            }
        }
        int[] hash2 = new int[101];
        for (int i : nums2) {
            if (hash2[i] < 1) {
                hash2[i]++;
            }
        }
        int[] hash3 = new int[101];
        for (int i : nums3) {
            if (hash3[i] < 1) {
                hash3[i]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (hash1[i] + hash2[i] + hash3[i] > 1) {
                res.add(i);
            }
        }
        return res;
    }
}
