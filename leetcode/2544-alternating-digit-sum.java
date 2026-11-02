class Solution {
    public int alternateDigitSum(int n) {
        StringBuilder st = new StringBuilder();
        st.append(n);
        int s = 0;
        for (int i = 0; i < st.length(); i++) {
            if (i % 2 == 0) {
                s += st.charAt(i) - '0';
            } else {
                s -= st.charAt(i) - '0';
            }
        }
        return s;
    }
}
