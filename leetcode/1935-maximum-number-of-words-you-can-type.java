class Solution {
    public int canBeTypedWords(String t, String bl) {
        String[] arr = t.split(" ");
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < bl.length(); i++) {
            st.add(bl.charAt(i));
        }
        int c = 0;
        for (String str : arr) {
            int q = 0;
            for (int i = 0; i < str.length(); i++) {
                if (st.contains(str.charAt(i))) {
                    q = 1;
                    break;
                }
            }
            if (q == 0) {
                c++;
            }
        }
        return c;
    }
}
