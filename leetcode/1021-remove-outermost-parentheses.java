class Solution {
    public String removeOuterParentheses(String s) {
        int x = 0;
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                x--;
            }
            if (x > 0) {
                st.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                x++;
            }
        }
        return st.toString();
    }
}
