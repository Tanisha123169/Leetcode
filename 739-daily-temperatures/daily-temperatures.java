class Solution {
    public int[] dailyTemperatures(int[] temp) {
       Stack<Integer> st=new Stack<>();
       int[] ans=new int[temp.length];
       for(int i=0;i<temp.length;i++){
        while(!st.isEmpty() && temp[st.peek()]<temp[i]){
            ans[st.peek()]=i-st.pop();
        }
        st.push(i);
       } 
      return ans;

    }
}