class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(char c:s.toCharArray()){
        

          if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
        else {
            st.push(c);

            }
            

        }
        StringBuilder ans =new StringBuilder();
        while(!st.isEmpty()){
            char k =st.pop();
            ans.append(k);

        }
        return ans.reverse().toString();
    }
}