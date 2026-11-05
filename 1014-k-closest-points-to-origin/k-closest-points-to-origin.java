class Pair{
    int a;
    int b;
    int dis;
    public Pair(int a,int b){
        this.a=a;
        this.b=b;
        this.dis=(a*a)+(b*b);
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
     PriorityQueue<Pair> heap=new PriorityQueue<>((a,b)->b.dis-a.dis);
     for(int[] i:points){
        heap.add(new Pair(i[0],i[1]));
     }


        while(heap.size()>k){
            heap.poll();
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i][0]=heap.peek().a;
            ans[i][1]=heap.peek().b;
            heap.poll();
        }
        return ans;
    }
}