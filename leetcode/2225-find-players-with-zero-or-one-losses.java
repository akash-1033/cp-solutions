class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> st = new TreeSet<>();
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int[] arr : matches) {
            st.add(arr[0]);
            mp.put(arr[1], mp.getOrDefault(arr[1], 0) + 1);
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : st) {
            if (!mp.containsKey(i)) {
                ans.add(i);
            }
        }
        res.add(ans);
        List<Integer> qwe = new ArrayList<>();
        mp.forEach((key, val) -> {
            if (val == 1) {
                qwe.add(key);
            }
        });
        res.add(qwe);
        return res;
    }
}
