class Solution {
    public int minimumPushes(String word) {

        // Frequency of each character.
        int[] mp = new int[26];

        // Count occurrences of every letter.
        for (int i = 0; i < word.length(); i++) {
            mp[word.charAt(i) - 'a']++;
        }

        // Sort frequencies in ascending order.
        // The largest frequencies will now be at the end.
        Arrays.sort(mp);

        // Start from the most frequent character.
        int i = 25;

        // Current push count.
        // First 8 characters require 1 push,
        // next 8 require 2 pushes,
        // next 8 require 3 pushes,
        // remaining 2 require 4 pushes.
        int pushes = 1;

        // Final answer.
        int total = 0;

        // Process characters from highest frequency to lowest.
        while (i >= 0) {

            // Each push level can accommodate at most 8 letters.
            int slots = 8;

            while (i >= 0 && slots > 0) {

                // Greedy:
                // Give the highest remaining frequency
                // the smallest available push count.
                total += pushes * mp[i];

                i--;
                slots--;
            }

            // Move to the next push level.
            pushes++;
        }

        return total;
    }
}
