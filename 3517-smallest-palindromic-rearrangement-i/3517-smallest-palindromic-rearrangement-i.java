class Solution {
    public String smallestPalindrome(String s) {
        char[] str = s.toCharArray();
        int[] count = new int[26];
        for(char c : str){
            count[c-'a']++;
        }
        int n = str.length;
        char[] ans = new char[n];
        int cur=0;
        for(int i=0;i<26;i++){
            while(count[i]>1){
                

                ans[cur]=(char)(i+'a');
                ans[n-1-cur]=ans[cur];
                cur++;
                count[i]-=2;
                
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]==1){
ans[n/2]=(char) (i+'a');
            }
        }
        return new String(ans);
    }
}