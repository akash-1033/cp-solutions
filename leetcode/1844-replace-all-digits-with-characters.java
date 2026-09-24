class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {

                str.append(s.charAt(i));
            } else {
                int k = s.charAt(i) - '0';
                str.append((char) (s.charAt(i - 1) + k));
            }
        }
        return str.toString();
    }
}
