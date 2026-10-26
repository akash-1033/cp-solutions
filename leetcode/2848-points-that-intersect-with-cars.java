class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> st = new HashSet<>();
        for (List<Integer> arr : nums) {
            for (int i = arr.get(0); i <= arr.get(1); i++) {
                st.add(i);
            }
        }
        return st.size();
    }
}
