class Solution {
    public int majorityElement(int[] nums) {
        int can=nums[0];
        int c=0;
        for(int i:nums){
               if(i==can) c++;
            if(c==0) {
              if(i!=can) {
                    can=i;
                    c++;
               }}
               else{
                if(i!=can){
                    c--;
                }
               }
     
        }
        return can;
    }
}