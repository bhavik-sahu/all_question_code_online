class Solution {
    private boolean check(String s){
        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;


           
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int len = s.length();
        String smax= s.substring(0,1);
        int max =1;
        for(int i=0;i<len;i++){
            for(int j=i+max;j<=len;j++){
                if(j-i>max && check(s.substring(i,j))){
                max = Math.max(max,j-i);
                smax = s.substring(i,j);
                }
            }
        }
        return smax;
    }
}