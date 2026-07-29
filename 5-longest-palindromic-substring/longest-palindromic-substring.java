class Solution {
    public String longestPalindrome(String s) {
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (check(s, i, j)) {
                    if (j - i >b - a) {
                        a = i;
                        b = j;
                    }
                }
            }

        }
        return s.substring(a, b+1);
    }

    public boolean check(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        i++;
        j--;
        }
        return true;
       
          
        

    }

}