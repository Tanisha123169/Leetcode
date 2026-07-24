class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int m=Integer.MIN_VALUE;
        for(int i:nums){
            c+=i;
            m=Math.max(c,m);
            if(c<0) c=0;
        }
        return m;
    }
}