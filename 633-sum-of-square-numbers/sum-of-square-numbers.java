class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0,j=(long)Math.sqrt(c);
        while(i<=j){
            long r=(i*i)+(j*j);
            if(r==c||i*i==c||j*j==c) return true;
            if(r>c) j--;
            else i++;
        }
        return false;
    }
}