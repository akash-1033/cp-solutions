class Solution {
    public int possibleStringCount(String word) {
        int n = word.length(), x = 0;
        for (int i = 1; i < n; i++) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                x++;
            }
        }
        return x + 1;
    }
}
