class Solution {
    public boolean canCross(int[] stones) {
    int n=stones.length;
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    for(int i:stones){
        map.put(i,new HashSet<>());
    }
    map.get(0).add(0);
    for(int i=0;i<n;i++){
        int stone=stones[i];
        for(int k:map.get(stone)){
            for(int jump=k-1;jump<=k+1;jump++){
                if(jump<=0) continue;
                int next=stone+jump;
                if(map.containsKey(next)){
                    map.get(next).add(jump);
                }
            }
        }
    }
    return !map.get(stones[n-1]).isEmpty();
    }
}