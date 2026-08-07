class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int can1 = 0, can2 = 0;
        int c1 = 0, c2 = 0;

        // Find potential candidates
        for (int num : nums) {

            if (num == can1) {
                c1++;
            } else if (num == can2) {
                c2++;
            } else if (c1 == 0) {
                can1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                can2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        // Verify candidates
        c1 = 0;
        c2 = 0;

        for (int num : nums) {
            if (num == can1)
                c1++;
            else if (num == can2)
                c2++;
        }

        List<Integer> ans = new ArrayList<>();
        int limit = nums.length / 3;

        if (c1 > limit)
            ans.add(can1);
        if (c2 > limit)
            ans.add(can2);

        return ans;
    }
}