class Solution {
    public int findMiddleIndex(int[] nums) {
        long t=0,l=0;
        for(int i:nums){
            t+=i;
        }
        for(int i=0;i<nums.length;i++){
              t-=nums[i];
              if(t==l) return i;
              l+=nums[i];
        }
        return -1;
    }
}