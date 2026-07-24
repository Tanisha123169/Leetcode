class Solution {
    public int maxProduct(int[] nums) {
       
         int res=Integer.MIN_VALUE;
         for(int i:nums){
 res=Math.max(res,i);
         }
           int min=1;
         int max=1;
         for(int i:nums){
           
        int r=max*i;
            max=Math.max(r,Math.max(min*i,i));
            min=Math.min(r,Math.min(min*i,i));
              res=Math.max(res,max);
         }
         return res;
    }
}