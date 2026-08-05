class Solution {
    public int pivotInteger(int n) {
        int s = n * (n + 1) / 2;
        int k = (int) Math.sqrt(s);
        return k * k == s ? k : -1;
    }
}
