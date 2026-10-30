class Solution {
    public String freqAlphabets(String s) {
        StringBuilder st = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                String q = "";
                q += s.charAt(i - 2);
                q += s.charAt(i - 1);
                st.append((char) (Integer.parseInt(q) + 'a' - 1));
                i -= 3;
            } else {
                st.append((char) (Integer.parseInt(s.charAt(i) + "") + 'a' - 1));
                i--;
            }
        }
        return st.reverse().toString();
    }
}
