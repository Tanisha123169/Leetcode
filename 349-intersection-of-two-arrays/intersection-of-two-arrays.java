class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        int k=0;
        for(int i:nums2){
            if(set.contains(i)){
               nums2[k]=i;
               k++;
                set.remove(i);
               
            }
        }
        return Arrays.copyOf(nums2,k) ;
    }
}