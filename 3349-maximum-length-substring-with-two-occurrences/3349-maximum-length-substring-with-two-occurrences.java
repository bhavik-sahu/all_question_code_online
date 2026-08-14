class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length(),total=0,max=0;
        int[] count = new int[26];
        for(int i=0;i<n-1;i++){
            
                Arrays.fill(count,0);
            total=0;
            for(int j=i;j<n;j++){
            if(count[s.charAt(j)-'a']>=2){
                break;
            }
            
            count[s.charAt(j)-'a']++;
            total++;
            max = Math.max(total,max);
            

            }
        }
        return max;
    }
}