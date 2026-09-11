class Solution {
    public int totalNumbers(int[] d) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < d.length; i++) {
            if (d[i] != 0) {
                for (int j = 0; j < d.length; j++) {
                    if (i != j) {
                        for (int k = 0; k < d.length; k++) {
                            if (k != i && k != j && d[k] % 2 == 0) {
                                st.add((d[i] * 100) + (d[j] * 10) + d[k]);
                            }
                        }
                    }
                }
            }
        }
        return st.size();
    }
}
