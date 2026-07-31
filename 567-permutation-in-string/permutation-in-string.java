class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']+=1;
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
                if(check(a,s2,i,i+s1.length())) return true;
        }
        return false;
    }
    boolean check(int[] a,String s2,int i,int j){
        int[]b=new int[26];
        for(int x=i;x<j;x++){
              b[s2.charAt(x)-'a']+=1;
        }
        for(int x=0;x<26;x++){
            if(a[x]!=b[x]) return false;
        }
        return true;
    }
}