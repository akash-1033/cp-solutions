class Solution {
    public double calculateTax(int[][] br, int inc) {
        double t = 0.00;
        int k = 0;
        for (int[] arr : br) {
            if (arr[0] - k <= inc) {
                inc -= (arr[0] - k);
                t += (arr[1] * (arr[0] - k)) / 100.0;
                k = arr[0];
            } else {
                t += (arr[1] * inc) / 100.0;
                break;
            }
        }
        return t;
    }
}
