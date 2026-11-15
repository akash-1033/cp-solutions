class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i : arr) {
            res.add(i);
            if (i == 0) {
                res.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(i);
        }
    }
}
