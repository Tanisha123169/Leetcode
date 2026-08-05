class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    int s=0,c=0;
    for(int i:nums){
        s+=i;
        c+=map.getOrDefault(s-k,0);
        map.put(s,map.getOrDefault(s,0)+1);
    }
    return c;

    }
}