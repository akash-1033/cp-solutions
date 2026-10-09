class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int mx = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int s = 0, n = i;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            mp.put(s, mp.getOrDefault(s, 0) + 1);
            mx = Math.max(mx, mp.get(s));
        }
        return mx;
    }
}
