class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        int a = Integer.MIN_VALUE, b = -1;
        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                mp.putIfAbsent(hash[i], new ArrayList());
                mp.get(hash[i]).add(i);
                if (mp.get(hash[i]).size() >= a) {
                    if (mp.get(hash[i]).size() == a) {
                        b = Math.max(b, hash[i]);
                    } else {
                        b = hash[i];
                    }
                    a = mp.get(hash[i]).size();
                }
            }
        }
        StringBuilder st = new StringBuilder();
        for (int i : mp.get(b)) {
            st.append((char) (i + 'a'));
        }
        return st.toString();
    }
}
