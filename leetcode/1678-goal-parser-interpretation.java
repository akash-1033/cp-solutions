class Solution {
    public String interpret(String c) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < c.length()) {
            if (i < c.length() - 1 && c.charAt(i) == '(' && c.charAt(i + 1) == ')') {
                str.append('o');
                i += 2;
            } else if (c.charAt(i) == '(') {
                str.append("al");
                i += 4;
            } else {
                str.append('G');
                i++;
            }
        }
        return str.toString();
    }
}
