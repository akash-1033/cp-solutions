class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = new int[2];
        for (String s : events) {
            if (s.equals("1") || s.equals("WD") || s.equals("NB")) {
                ans[0] += 1;
            } else if (s.equals("2")) {
                ans[0] += 2;
            } else if (s.equals("3")) {
                ans[0] += 3;
            } else if (s.equals("4")) {
                ans[0] += 4;
            } else if (s.equals("6")) {
                ans[0] += 6;
            } else if (s.equals("W")) {
                ans[1]++;
            }
            if (ans[1] == 10) {
                break;
            }
        }
        return ans;
    }
}
