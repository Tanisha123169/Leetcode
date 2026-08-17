class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        long[] p = new long[n];

        p[0] = nums[0];

        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + nums[i];
        }

        int d = 2 * k + 1;

        for (int i = 0; i < n; i++) {
            if (i < k || i >= n - k) {
                ans[i] = -1;
            } else {
                if (i == k) {
                    ans[i] = (int)(p[i + k] / d);
                } else {
                    ans[i] = (int)((p[i + k] - p[i - k - 1]) / d);
                }
            }
        }

        return ans;
    }
}