class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        mp.forEach((key, value) -> {
            pq.add(value);
        });
        int x = 0, n = arr.length;
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            n -= pq.poll();
            x++;
            if (n <= arr.length / 2) {
                return x;
            }
        }
        return -1;
    }
}
