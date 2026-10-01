class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();       
        int count =0,len = s.length();
        if(len<2)return false;
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                st.push(c);
                if(c=='(')count++;
            else if(c=='{')count=count+2;
            else if(c=='[')count=count+3;
            }
            else{
            if(st.isEmpty())return false;
                char k = (char)st.pop();
                                           
            if(c==')')count--;
            else if(c=='}')count=count-2;
            else if(c==']')count=count-3;

                if(c==')' && k!='(') return false;
if(c=='}' && k!='{') return false;
if(c==']' && k!='[') return false;
            }
    }
    if(count==0)return true;
    else return false;
}}