class Solution {
    public boolean isAnagram(String s, String t) {
        char[] f = s.toCharArray();
        int cnt=0;
        char[] k = t.toCharArray();
        int n = f.length;
        int l = k.length;
        if(n!=l)return false;
        Arrays.sort(f);
        Arrays.sort(k);
        for(int i=0;i<n;i++){
            if(f[i]==k[i]){
                cnt++;
            }
        }
        if(n==cnt)return true;
        else return false;

        
    }
}