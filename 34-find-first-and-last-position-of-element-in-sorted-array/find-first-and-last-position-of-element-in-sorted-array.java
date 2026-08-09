class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { find(nums, target), secfind(nums, target) };
    }

    public int find(int[] nums, int target) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int m = (e + s) / 2;
            if (nums[m] >= target) {
                if (nums[m] == target) {
                    ans = m;
                }
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

    public int secfind(int[] nums, int target) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int m = (e + s) / 2;
            if (nums[m] <= target) {
                if (nums[m] == target) {
                    ans = m;
                }
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}