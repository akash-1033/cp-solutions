class Solution {
    public boolean checkString(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'b') {
                while (i < s.length()) {
                    if (s.charAt(i) == 'a') {
                        return false;
                    }
                    i++;
                }
            }
            i++;
        }
        return true;
    }
}
