class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            String temp="" ;
            if(s.charAt(i)==')'){
                while(st.peek()!='('){
                char t = st.pop();
                temp = temp+t;
                }
                st.pop();
            int tn = temp.length();
            for(int j=0;j<tn;j++){
                st.push(temp.charAt(j));
            }
            }
            else{
            st.push(s.charAt(i));
            }

        }
        StringBuilder ans =new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}