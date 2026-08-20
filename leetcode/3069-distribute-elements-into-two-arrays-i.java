class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        res.add(nums[0]);
        arr.add(nums[1]);
        int i = 2;
        while (i < nums.length) {
            if (res.get(res.size() - 1) > arr.get(arr.size() - 1)) {
                if (i < nums.length) {
                    res.add(nums[i]);
                    i++;
                }
            } else {
                if (i < nums.length) {
                    arr.add(nums[i]);
                    i++;
                }
            }
        }
        int j = 0;
        for (int x : res) {
            nums[j] = x;
            j++;
        }
        for (int x : arr) {
            nums[j] = x;
            j++;
        }
        return nums;
    }
}
