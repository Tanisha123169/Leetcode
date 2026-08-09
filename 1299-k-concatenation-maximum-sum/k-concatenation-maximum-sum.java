class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
       long MOD=1000000007L;
       long ts=0;
       int n=arr.length;
       for(int i:arr){
        ts+=i;
       }
       long curr=0,ms=0;
       int l=(k==1)?n:n*2;
       for(int i=0;i<l;i++){
        int v=arr[i%n];
        curr=Math.max(0,curr+v);
        ms=Math.max(ms,curr);
       }
       if(k>2&&ts>0) ms+=ts*(k-2);
       return (int)(ms%MOD);
    
    }
}