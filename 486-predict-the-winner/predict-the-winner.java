class Solution {
    int solve(int[] nums,int st,int en,int[][]dp){
        if(st>en) return 0;
        if(dp[st][en]!=-1) return dp[st][en];
        int ch=nums[st]-solve(nums,st+1,en,dp);
        int c=nums[en]-solve(nums,st,en-1,dp);
        return dp[st][en]=Math.max(ch,c);

    }
    public boolean predictTheWinner(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(nums,0,nums.length-1,dp)>=0;
    }
}