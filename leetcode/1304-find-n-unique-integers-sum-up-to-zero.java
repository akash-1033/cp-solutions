class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 0) {
            arr = func(arr, n);
        } else {
            n--;
            arr = func(arr, n);
            arr[n] = 0;
        }
        return arr;
    }

    public int[] func(int[] arr, int n) {
        for (int i = 1; i <= n / 2; i++) {
            arr[i - 1] = i;
        }
        for (int i = n / 2 + 1; i <= n; i++) {
            arr[i - 1] = -(i - (n / 2));
        }
        return arr;
    }
}
