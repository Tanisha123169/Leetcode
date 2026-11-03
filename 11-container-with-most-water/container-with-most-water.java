class Solution {
    public int maxArea(int[] height) {
        int i=0, right=height.length-1;
        int max=0;
        while(i<right){
          int min=Math.min(height[i],height[right]);
          int area=(right-i)*min;
          max=Math.max(max,area);
            if(height[i]==min) i++;
            else right--;
        }
        return max;
    }
}