class Solution {
    public boolean isPalindrome(int x) {
        int lastdig,rev=0;
        int dup = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            lastdig = x%10;
            rev = (rev*10)+lastdig;
            x = x/10;
        }
        if(rev==dup){
            return true;
        }
        else{
            return false;
        }
        
    }
}