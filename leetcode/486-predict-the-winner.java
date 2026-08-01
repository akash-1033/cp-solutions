class Solution {

    public boolean predictTheWinner(int[] nums) {

        // Start recursion.
        //
        // i = left pointer
        // j = right pointer
        // s = Player 1's score
        // x = Player 2's score
        // q = current turn
        //     0 -> Player 1
        //     1 -> Player 2
        return dfs(nums, 0, nums.length - 1, 0, 0, 0);
    }

    public boolean dfs(int[] nums, int i, int j, int s, int x, int q) {

        // Base case:
        // All numbers have been picked.
        // Player 1 wins if his score is at least Player 2's.
        if (j < i) {
            return s >= x;
        }

        if (q == 0) {

            /*
             * PLAYER 1'S TURN
             * -------------------------
             * Player 1 wants to WIN.
             *
             * Therefore he will choose whichever move
             * eventually makes him win.
             *
             * So we use OR.
             */

            return dfs(nums, i + 1, j, s + nums[i], x, 1)
                    || dfs(nums, i, j - 1, s + nums[j], x, 1);

        } else {

            /*
             * PLAYER 2'S TURN
             * -------------------------
             * Player 2 is also playing optimally.
             *
             * Player 2 wants Player 1 to LOSE.
             *
             * Therefore, if there exists even one move
             * that makes Player 1 lose, Player 2 will
             * definitely choose it.
             *
             * Hence Player 1 can guarantee victory only if
             * BOTH choices made by Player 2 still lead
             * to Player 1 winning.
             *
             * Therefore we use AND.
             */

            return dfs(nums, i + 1, j, s, x + nums[i], 0)
                    && dfs(nums, i, j - 1, s, x + nums[j], 0);
        }
    }
}
