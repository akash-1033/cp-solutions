class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                int depth = st.isEmpty() ? 0 : st.peek();
                ans[i] = depth % 2;
                st.push(depth + 1);
            } else {
                int depth = st.peek() - 1;
                st.push(depth);
                ans[i] = depth % 2;
            }
        }
        return ans;
    }
}
