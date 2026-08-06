class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i].substring(0, arr[i].length() - 1);
            int k = (int) (arr[i].charAt(arr[i].length() - 1) - '0');
            res[k - 1] = str;
        }
        StringBuilder str = new StringBuilder();
        for (String t : res) {
            str.append(t);
            str.append(" ");
        }
        return str.toString().trim();
    }
}
