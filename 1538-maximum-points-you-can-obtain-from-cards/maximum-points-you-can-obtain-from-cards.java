class Solution {
    public int maxScore(int[] c, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=c[i];
        }
        int m=s,j=k-1;
        for(int i=c.length-1;i>=c.length-k;i--){
            
            s+=c[i]-c[j];
            j--;
            m=Math.max(m,s);
        }

        return m;
    }
}