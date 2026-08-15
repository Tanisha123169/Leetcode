class Solution {
    public int maximumLengthSubstring(String s) {
        int[] a = new int[26];
        int ans = 0;
        int l = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            int r = s.charAt(i) - 'a';
            while (a[r] >= 2) {
                int r1=s.charAt(l)-'a';
                
                a[r1]--;
                l++;
                c--;
            }
            a[r]++;
            c++;
            ans = Math.max(ans, c);
        }
        return ans;
    }
}