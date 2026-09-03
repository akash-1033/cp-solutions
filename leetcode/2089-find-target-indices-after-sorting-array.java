class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int c = 0, k = 0;
        for (int i : nums) {
            if (i < target) {
                c++;
            }
            if (i == target) {
                k++;
            }
        }
        for (int i = c; i < c + k; i++) {
            res.add(i);
        }
        return res;
    }
}
