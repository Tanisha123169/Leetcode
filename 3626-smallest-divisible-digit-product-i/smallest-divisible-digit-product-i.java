class Solution {
    public int smallestNumber(int n, int t) {
        while (n <= 100) {
            int r = n;
            int p = 1;
            while (r > 0) {
                int rem = r % 10;
                if(rem==0) {
                    p=0;
                    break;
                }
                p *= rem;
                r /= 10;
            }
            if (p % t == 0)
                return n;
            n++;

        }
        return 100;
    }
}