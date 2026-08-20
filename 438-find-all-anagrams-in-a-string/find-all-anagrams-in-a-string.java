class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        int len=p.length();
        for(int i=0;i<len;i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int j=0,c=0,l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)>0) c++;
               
                map.put(ch,map.get(ch)-1);
            }
            if(i+1-j>len){
              char r=s.charAt(j);
              if(map.containsKey(r)){
                map.put(r,map.get(r)+1);
              
              if(map.get(r)>0) c--;
              }
            j++;
            }
            if(i-j+1==len&&c==len) ans.add(j);
        }
        return ans;
    }
}