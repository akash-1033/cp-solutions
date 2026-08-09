class Solution {
    public int minFlipsMonoIncr(String s) {

        // Number of 1s encountered so far.
        int ones = 0;

        // Minimum flips needed for the prefix processed so far.
        int flips = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {

                // This 1 can remain 1.
                ones++;

            } else {

                /*
                 * We encountered a 0 after some 1s.
                 *
                 * Option 1:
                 * Flip this 0 -> 1
                 *
                 * Cost = flips + 1
                 *
                 * Option 2:
                 * Keep this 0.
                 * Then all previous 1s must become 0.
                 *
                 * Cost = ones
                 */
                flips = Math.min(flips + 1, ones);
            }
        }

        return flips;
    }
}
