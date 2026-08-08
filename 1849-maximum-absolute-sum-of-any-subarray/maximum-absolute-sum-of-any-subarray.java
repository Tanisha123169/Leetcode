class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans=0;
        int max=0;
        int min=0;
        for(int i:nums){
           max=Math.max(max,0)+i;
           min=Math.min(min,0)+i;
           ans=Math.max(ans,Math.max(max,Math.abs(min)));
        }
        return ans;
    }
}