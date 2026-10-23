class Solution {
    public String sortString(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int n = s.length(), c = 0;
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            if (c == 0) {
                for (int i = 0; i < 26; i++) {
                    if (hash[i] > 0) {
                        hash[i]--;
                        str.append((char) (i + 'a'));
                        n--;
                    }
                }
                c = 1;
            } else {
                for (int i = 25; i >= 0; i--) {
                    if (hash[i] > 0) {
                        hash[i]--;
                        str.append((char) (i + 'a'));
                        n--;
                    }
                }
                c = 0;
            }
        }
        return str.toString();
    }
}
