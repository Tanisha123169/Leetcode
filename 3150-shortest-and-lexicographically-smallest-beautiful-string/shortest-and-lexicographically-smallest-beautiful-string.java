class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       int l=0;
       int c=0;
       int in=0,ir=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c+=1;
                while(c>k-1){
                    if(s.charAt(l)=='1'){
                        c--;
                    }
                    l+=1;
                }
                if(l>0 && s.charAt(l-1)=='1'){
                    l-=1;
                    c+=1;
                }
                
            }
            if(c==k){
                if(ir-in>i-l || ir-in==i-l && s.substring(l,i+1).compareTo(s.substring(in,ir+1))<0){

                    
                    in=l;
                    ir=i;
                }
            }
        }
        if(c!=k) return "";
        return s.substring(in,ir+1);
    }
}