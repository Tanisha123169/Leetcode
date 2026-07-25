class Solution {
    public int minimumRecolors(String blocks, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='B') s++;
        }
        int m=s;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='B'){
                if(blocks.charAt(i-k)!='B') s++;
            }else{
                m=Math.max(m,s);
                if(blocks.charAt(i-k)=='B') s--;
            }
        }
        m=Math.max(m,s);
        int ans =k-m;
        if(ans<=0) return 0;
        return ans;
    }
}