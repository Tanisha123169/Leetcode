class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int ans=-1;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2) queue.offer(new int[]{i,j});
                if(grid[i][j]==1) count++;
            }
        }
        if(count==0) return 0;
        if(queue.isEmpty()) return -1;
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                   int[] arr=queue.poll();
                   for(int[] dir:dirs){
                    int x=dir[0]+arr[0];
                    int y=dir[1]+arr[1];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        grid[x][y]=2;
                        count--;
                        queue.offer(new int[]{x,y});
                    }
                   }
                size--;
                
            }
            ans++;
        }
        if(count==0) return ans;
        return -1;
    }
}