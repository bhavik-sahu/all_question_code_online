class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character,Integer>> st = new Stack<>();
        int n = s.length();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek().getKey()==c){
                int val = st.peek().getValue()+1;
                st.pop();
                if(val>=k){
                continue;
                }
                st.push(new Pair<>(c,val));
            }
            else if(st.isEmpty() || st.peek().getKey()!=c){
                st.push(new Pair<>(c,1));
            }

        }
            StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair<Character,Integer> p = st.pop();
            for(int i=0;i<p.getValue();i++){
                sb.append(p.getKey());
            }

        }
        return sb.reverse().toString();
    }
}