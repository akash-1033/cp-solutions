class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE, k = 0, c = 0, q = 0;
        ListNode prev = null;
        while (head != null) {
            if (prev != null && head.next != null &&
                    ((head.val > prev.val && head.val > head.next.val)
                            || (head.val < prev.val && head.val < head.next.val))) {
                if (k == 1) {
                    mx = Math.max(mx, q);
                    mn = Math.min(mn, c);
                }
                c = 0;
                k = 1;
            }
            if (k == 1) {
                c++;
                q++;
            }
            prev = head;
            head = head.next;
        }
        return new int[] { mn == Integer.MAX_VALUE ? -1 : mn, mx == Integer.MIN_VALUE ? -1 : mx };
    }
}
