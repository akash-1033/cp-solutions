class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            List<Integer> q = new ArrayList<>();
            while (n > 0) {
                q.add(0, n % 10);
                n /= 10;
            }
            res.addAll(q);
        }
        int[] ans = res.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}
