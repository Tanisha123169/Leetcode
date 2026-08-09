class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int n = Math.abs(nums[i]);
            if (Math.abs(ans) > n) {
                ans = nums[i];

            } else if (Math.abs(ans) == n) {
                if (nums[i] > ans) {
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}