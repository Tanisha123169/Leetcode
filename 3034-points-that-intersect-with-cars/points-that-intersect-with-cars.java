class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] prefixSum=new int[102];
        for(List<Integer> i:nums){
            int l=i.get(0);
            int r=i.get(1);
            prefixSum[l]= prefixSum[l]+1;
            prefixSum[r+1]= prefixSum[r+1]-1;
        }
        int ans=0;
        for(int i=1;i<102;i++){
       prefixSum[i]=prefixSum[i-1]+prefixSum[i];
            if(prefixSum[i]>0) ans+=1;
        }
        return ans;
    }
}