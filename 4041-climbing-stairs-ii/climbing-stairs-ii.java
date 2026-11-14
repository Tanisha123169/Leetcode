class Solution {
    public int climbStairs(int n, int[] costs) {
        int a=costs[0]+1;
        if(n==1) return a;
        int b=costs[1]+Math.min(4,a+1);
         if(n==2) return b;
        int c=costs[2]+Math.min(9,Math.min(a+4,b+1));
         if(n==3) return c;
         for(int i=3;i<n;i++){
            int d=costs[i]+Math.min(a+9,Math.min(b+4,c+1));
            a=b;
            b=c;
            c=d;
         }
         return c;
    }
}