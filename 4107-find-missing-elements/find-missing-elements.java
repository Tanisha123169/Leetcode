class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     int[] arr=new int[101];
     int min=101;
     int max=0;
     for(int i:nums){
        arr[i]=1;
        min=Math.min(min,i);
        max=Math.max(max,i);
     }  
     List<Integer> ans=new ArrayList<>();
     for(int i=min;i<max;i++){
        if(arr[i]==0) ans.add(i);
     }
     return ans;
    }
}