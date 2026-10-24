class Solution {
    public int splitNum(int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                a.append(arr[i]);
            } else {
                b.append(arr[i]);
            }
        }
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}
