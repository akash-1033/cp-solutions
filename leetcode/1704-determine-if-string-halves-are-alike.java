class Solution {
    public boolean halvesAreAlike(String s) {
        int q = 0, x = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                q++;
            }
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                x++;
            }
        }
        return x == q;
    }
}
