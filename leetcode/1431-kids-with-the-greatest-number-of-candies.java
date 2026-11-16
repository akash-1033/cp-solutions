class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        int mx = 0;
        for (int i : c) {
            mx = Math.max(mx, i);
        }
        List<Boolean> res = new ArrayList<>();
        for (int i : c) {
            if (i + ec >= mx) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
