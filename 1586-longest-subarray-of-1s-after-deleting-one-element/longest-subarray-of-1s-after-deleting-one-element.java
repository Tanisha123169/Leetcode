class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,m=0,z=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            z++;
           }
           while(z>1){
           if( nums[left]==0) z--;
           left++;
           }
           m=Math.max(m,i-left);
        }
        return m;
    }
}