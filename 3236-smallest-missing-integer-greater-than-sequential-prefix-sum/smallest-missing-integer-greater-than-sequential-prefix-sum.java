class Solution {
    public int missingInteger(int[] nums) {
        int[] a=new int[51];
      int sum=nums[0];
        for(int i:nums){
            a[i]=1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
              sum+=nums[i];
            }
            else{
              break;
            } 
        }
        if(sum>50) return sum;
        for(int i=sum;i<51;i++){
            if(a[i]==0) return i;
        }
        return 51;
    }
}