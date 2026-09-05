class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        String str = Integer.toString(num);
        if (str.charAt(str.length() - 1) == '0') {
            return false;
        }
        return true;
    }
}
