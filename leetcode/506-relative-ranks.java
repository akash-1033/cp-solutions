class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOfRange(score, 0, score.length);
        Arrays.sort(score);
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            mp.put(score[i], score.length - i);
        }
        String[] res = new String[score.length];
        for (int i = 0; i < arr.length; i++) {
            if (mp.get(arr[i]) == 1) {
                res[i] = "Gold Medal";
            } else if (mp.get(arr[i]) == 2) {
                res[i] = "Silver Medal";
            } else if (mp.get(arr[i]) == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = mp.get(arr[i]) + "";
            }
        }
        return res;
    }
}
