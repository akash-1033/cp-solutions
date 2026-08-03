class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        for (String str : word1) {
            s.append(str);
        }
        for (String str : word2) {
            t.append(str);
        }
        return s.toString().equals(t.toString());
    }
}
