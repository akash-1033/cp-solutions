class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            a.append(firstWord.charAt(i) - 'a');
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            b.append(secondWord.charAt(i) - 'a');
        }
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            c.append(targetWord.charAt(i) - 'a');
        }
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString())
        == Integer.parseInt(c.toString());
    }
}
