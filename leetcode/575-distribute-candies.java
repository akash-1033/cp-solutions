class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> st = new HashSet<>();
        for (int i : candyType) {
            st.add(i);
        }
        return Math.min(candyType.length / 2, st.size());
    }
}
