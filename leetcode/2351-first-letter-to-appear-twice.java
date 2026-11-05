class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            st.add(s.charAt(i));
        }
        return 'a';
    }
}
