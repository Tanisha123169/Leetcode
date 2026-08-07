class Solution {
    public int maxRotateFunction(int[] nums) {
    /*   int i=0,m=0;
        while(i<nums.length){
            int s=0,j=i;
            for(int k=0;k<nums.length;k++){
                if(j==nums.length) j=0;
                s=s+(nums[k]*j);
                j++;
            }
            m=Math.max(m,s);
            i++;
        }
        return m;*/

        long s=0,m=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
            m+=nums[i]*i;
        }
        long last=m;
        for(int i=1;i<n;i++){
        last=last+s-(long)(n*nums[n-i]);
            m=Math.max(m,last);
        }
        return (int) m;
    }
}