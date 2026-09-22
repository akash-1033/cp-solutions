class Solution {
    String z;

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            str.append("0");
        }
        Set<String> s = new HashSet<>();
        for (String x : nums) {
            s.add(x);
        }
        dfs(s, str, 0);
        return z;
    }

    public boolean dfs(Set<String> s, StringBuilder str, int ind) {
        if (!s.contains(str.toString())) {
            z = str.toString();
            return true;
        }
        if (ind >= str.length()) {
            return false;
        }
        str.setCharAt(ind, '1');
        boolean b = dfs(s, str, ind + 1);
        str.setCharAt(ind, '0');
        boolean c = dfs(s, str, ind + 1);
        return b || c;
    }
}
