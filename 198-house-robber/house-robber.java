class Solution {
    public int rob(int[] nums) {
            int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return check(0,nums.length-1,nums,dp);
    }
    public int check(int sum,int n,int[] nums,int[]dp){
        if(n<0) return sum;
        if(dp[n]!=-1) return dp[n];
        dp[n]= Math.max(check(sum,n-2,nums,dp)+nums[n],check(sum,n-1,nums,dp));
        return dp[n];
    }
}