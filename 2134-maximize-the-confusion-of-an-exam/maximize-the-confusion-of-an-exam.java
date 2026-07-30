class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int l=0,z=0,m=0;
        for(int i=0;i<a.length();i++){
         if(a.charAt(i)=='T'){
            z++;
         }
         while(z>k){
            if(a.charAt(l)=='T'){
                z--;
            }
            l++;
         }
         m=Math.max(m,i-l+1);
        }
        l=0;
        z=0;
         for(int i=0;i<a.length();i++){
         if(a.charAt(i)=='F'){
            z++;
         }
         while(z>k){
            if(a.charAt(l)=='F'){
                z--;
            }
            l++;
         }
         m=Math.max(m,i-l+1);
        }
        return m;
    }
}