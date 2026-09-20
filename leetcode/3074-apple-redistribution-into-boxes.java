class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s = 0, n = capacity.length;
        for (int i : apple) {
            s += i;
        }
        Arrays.sort(capacity);
        for (int i = n - 1; i >= 0; i--) {
            s -= capacity[i];
            if (s <= 0) {
                return n - i;
            }
        }
        return n;
    }
}
