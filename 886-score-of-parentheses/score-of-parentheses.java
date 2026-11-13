class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int val = st.pop();
                int sc = Math.max(val * 2, 1);
                if (st.isEmpty()) {
                    st.push(sc);
                } else {
                    st.push(st.pop() + sc);
                }
            }
        }
        return st.pop();
    }
}