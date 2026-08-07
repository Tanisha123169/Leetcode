class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        if (k == n)
            return nums;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] b = new ArrayList[n + 1];
        for (int i : map.keySet()) {
            int r = map.get(i);
            if (b[r] == null) {
                b[r] = new ArrayList<Integer>();
            }
            b[r].add(i);
            
        }
        int j = 0;
        for (int i = b.length - 1; i >= 0 && j < k; i--) {

            if (b[i] != null) {

                for (int num : b[i]) {

                    ans[j++] = num;

                    if (j == k)
                        break;
                }
            }
        }
        return ans;
    }
}