class Solution {
    public int countAsterisks(String s) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && c == 0) {
                a++;
            } else if (s.charAt(i) == '|' && c == 0) {
                c = 1;
            } else if (s.charAt(i) == '|' && c == 1) {
                b = 0;
                c = 0;
            }
        }
        return a + b;
    }
}
