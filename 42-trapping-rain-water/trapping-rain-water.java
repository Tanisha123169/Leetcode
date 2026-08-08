class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int i=0,j=n-1;
        int l=0,r=0;
       while(i<j){
        if(height[i]<=height[j]){
            if(l<=height[i]){
            l=height[i];
            }else{
                water+=l-height[i];
            }
            i++;
        }else{
            if(r<=height[j]){
                r=height[j];
            }else{
                water+=r-height[j];
            }
            j--;
        }
       }

        return water;
    }
}