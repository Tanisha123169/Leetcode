class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0,s=0,m=Integer.MAX_VALUE;
        while(r<nums.length){
        if(s<target){    s+=nums[r];
            r++;
        }
            while(s>=target){
                m=Math.min(m,r-l);
                s-=nums[l];
                l++;
            }
        }if(m==Integer.MAX_VALUE) return 0;
        return m;
    }
}