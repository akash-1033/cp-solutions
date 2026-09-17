class Solution {
    public String trimTrailingVowels(String s) {
        String str = "aeiou";
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if (str.indexOf(s.charAt(i)) == -1) {
                break;
            }
        }
        return i >= 0 ? s.substring(0, i + 1) : "";
    }
}
