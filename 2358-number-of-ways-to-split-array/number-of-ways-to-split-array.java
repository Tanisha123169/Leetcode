class Solution {
    public int waysToSplitArray(int[] nums) {
        long t = 0, l = 0;
        for (int i : nums) {
            t += i;
        }
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            l += nums[i];
            t -= nums[i];
            if (l >= t)
                c++;
        }
        return c;
    }
}