class Solution {
    public int numberOfSteps(int num) {
        int z = 0;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            z += (num & 1) + 1;
            num >>= 1;
        }
        return z - 1;
    }
}
