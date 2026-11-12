class Solution {
    public int minimumSwaps(int[] nums) {
        int end = nums.length - 1, start = 0, count = 0;
        while (start < end) {
            while (end > 0 && nums[end] == 0) {
                end--;
            }
            while (start < nums.length && nums[start] != 0) {
                start++;
            }
            if (start < end && end > 0 && start < nums.length) {
                count++;
                start++;
                end--;
            }
        }
        return count;
    }
}