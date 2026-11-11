class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int mx = Integer.MIN_VALUE, c = -1;
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
            if (mx < mp.get(i)) {
                mx = mp.get(i);
                c = i;
            }
        }
        int x = 0, n = nums.size();
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == c) {
                x++;
                if (x > (i + 1) / 2 && (mx - x) > (n - i - 1) / 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
