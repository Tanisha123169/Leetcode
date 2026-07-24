class Solution {
    public void nextPermutation(int[] nums) {
        int a=-1,b=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        if(a==-1){
reverse(nums,0,nums.length-1);
        } 
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[a]){
                    b=i;
                    break;
                }
            }
           swap(nums,a,b);
           reverse(nums,a+1,nums.length-1);
        }
    
    }
    public void swap(int[] nums,int i,int j){
   int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
    }
  public void reverse(int[] nums,int i,int j){
        while(i<j){
         swap(nums,i,j);
         i++;
         j--;
        }
    }
}