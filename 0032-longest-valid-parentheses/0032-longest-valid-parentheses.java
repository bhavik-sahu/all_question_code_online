class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(),max=0;
        if(n==0)return 0;
        Stack<Integer> st = new Stack<>();
           st.push(-1);
        for(int i=0;i<n;i++){
            int prev=-1;
        if(s.charAt(i)==')'){
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }
        }
        if(s.charAt(i)=='('){
            st.push(i);
        }
    max = Math.max(max,i-st.peek());
        }
        return max;
    }
}