class Solution {
    private void printer(char[] s,int left,int right){
        if(left<right){

        char c = s[left];
        s[left]=s[right];
        s[right]=c;
        left++;
        right--;
        printer(s,left,right);
        }


    }
    public void reverseString(char[] s) {
        int len = s.length;
        int left =0,right=len-1;
        printer(s,left,right);
    }
}