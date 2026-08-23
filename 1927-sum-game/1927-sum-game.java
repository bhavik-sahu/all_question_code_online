class Solution {
    public boolean sumGame(String num) {
        int diff=0,count=0;
        int n = num.length();
        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?' && i<n/2){
                count++;
            }
            else if(num.charAt(i)=='?' && i>=n/2){
                count--;
            }
            else if(i<n/2){
                diff+=num.charAt(i)-'0';
            }
            else{
                diff-=num.charAt(i)-'0';
            }
        }
        if(2*diff==(-9*count)){
            return false;
        }
        else {
             return true;
        }

    }
}