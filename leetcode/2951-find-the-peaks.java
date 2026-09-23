class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < m.length - 1; i++) {
            if (m[i - 1] < m[i] && m[i] > m[i + 1]) {
                res.add(i);
            }
        }
        return res;
    }
}
