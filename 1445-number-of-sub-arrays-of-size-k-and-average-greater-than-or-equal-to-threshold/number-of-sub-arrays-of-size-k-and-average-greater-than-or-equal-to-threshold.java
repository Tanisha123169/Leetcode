class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int c=0;
        if(s>=t*k) c++;
        for(int i=k;i<arr.length;i++){
            s+=arr[i]-arr[i-k];
              if(s>=t*k) c++;
        }
        return c;
    }
}