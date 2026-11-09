class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            if (s.length() < 3) {
                str.append(s.toLowerCase());
            } else {
                StringBuilder t = new StringBuilder(s.toLowerCase());
                t.setCharAt(0, Character.toUpperCase(t.charAt(0)));
                str.append(t);
            }
            str.append(" ");
        }
        return str.toString().trim();
    }
}
