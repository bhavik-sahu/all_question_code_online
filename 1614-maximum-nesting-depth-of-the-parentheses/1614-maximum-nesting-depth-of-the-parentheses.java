class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int max =0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')cnt++;
            max = Math.max(cnt,max);
            if(s.charAt(i)==')')cnt--;
        }
        return max;
    }
}