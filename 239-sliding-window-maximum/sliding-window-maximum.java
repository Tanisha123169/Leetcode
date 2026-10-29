class Pair{
    int num;
    int index;
    public Pair(int num,int index){
        this.num=num;
        this.index=index;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length-k+1;
        int[] ans=new int[n];
        Deque<Pair> queue=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(queue.size()>0&& queue.getLast().num<nums[i]){
                queue.removeLast();
            }
            queue.addLast(new Pair(nums[i],i));
        }
        for(int i=k;i<nums.length;i++){
            ans[i-k]=queue.getFirst().num;
             while(queue.size()>0&& queue.getLast().num<nums[i]){
                queue.removeLast();
            }
            while(queue.size()>0&&queue.getFirst().index<=i-k){
                  queue.removeFirst();
            }
            queue.addLast(new Pair(nums[i],i));
        }
        ans[n-1]=queue.getFirst().num;
        return ans;
    }
}