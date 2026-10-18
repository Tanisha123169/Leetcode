class Solution {
    public int rob(int[] nums) {
          if(nums.length==1) return nums[0];
          if(nums.length==2) return Math.max(nums[0],nums[1]);
          return Math.max(check(nums,0,nums.length-2),check(nums,1,nums.length-1));
    }
    public int check(int[] nums,int s,int e){
     
       int p0=nums[s];
       int p1=Math.max(nums[s],nums[s+1]);
        for(int i=s+2,j=2;i<=e;i++,j++){
           int ans=Math.max(p1,p0+nums[i]);
           p0=p1;
           p1=ans;
        }
        return p1;
    }
}