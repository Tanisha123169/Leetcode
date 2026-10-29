class Pair{
    char ch;
    int index;
    public Pair(char ch,int index){
        this.ch=ch;
        this.index=index;
    }
}
class Solution {
    public String clearStars(String s) {
        PriorityQueue<Pair> minHeap =new PriorityQueue<>((a,b)->{
        if(a.ch==b.ch){
            return b.index-a.index;
        }
        return a.ch-b.ch;
        });
       ArrayList<Pair> list=new ArrayList<>();
            for( int i=0;i<s.length();i++){
                char ch1=s.charAt(i);
                if(ch1!='*') minHeap.add(new Pair(ch1,i));
                else minHeap.poll();
            }
            while(!minHeap.isEmpty()){
                list.add(minHeap.poll());
            }
            Collections.sort(list,(m,n)->m.index-n.index);
            StringBuilder ans=new StringBuilder();
            for(Pair i:list){
                ans.append(i.ch);
            }
            return ans.toString();
    }
}