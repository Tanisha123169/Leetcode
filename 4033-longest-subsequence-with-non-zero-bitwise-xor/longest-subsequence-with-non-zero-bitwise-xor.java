class Solution {
    public int longestSubsequence(int[] nums) {
    int x=0;
    boolean b=false;
    for(int i:nums){
        x^=i;
        b=b||i>0;
    }
    if(x>0) return nums.length;
    if(b) return nums.length-1;
   return 0;
    }
}