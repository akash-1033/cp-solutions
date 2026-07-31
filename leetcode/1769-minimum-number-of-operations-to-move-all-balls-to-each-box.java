class Solution {
    public int[] minOperations(String boxes) {

        // s = sum of indices containing balls ('1')
        // c = total number of balls
        int s = 0, c = 0;

        // First pass:
        // Collect total balls and sum of their positions.
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                c++;
                s += i;
            }
        }

        // x = sum of indices of balls seen so far (left side including current)
        // y = number of balls seen so far
        int x = 0, y = 0;

        int[] arr = new int[boxes.length()];

        // Second pass:
        // Compute answer for every position.
        for (int i = 0; i < boxes.length(); i++) {

            // Include current box if it contains a ball.
            if (boxes.charAt(i) == '1') {
                x += i;
                y++;
            }

            /*
             * LEFT SIDE COST
             * ----------------------------
             * For every ball on the left:
             * distance = i - ballPosition
             *
             * Total =
             * (i-a) + (i-b) + (i-c)
             *
             * = y*i - (a+b+c)
             *
             * = y*i - x
             */
            int leftCost = y * i - x;

            /*
             * RIGHT SIDE COST
             * ----------------------------
             * Remaining balls:
             * count = c - y
             *
             * Sum of their indices:
             * s - x
             *
             * Distance:
             * (a-i) + (b-i) + ...
             *
             * = (a+b+...) - count*i
             *
             * = (s-x) - (c-y)*i
             */
            int rightCost = (s - x) - ((c - y) * i);

            // Total operations for box i.
            arr[i] = leftCost + rightCost;
        }

        return arr;
    }
}
