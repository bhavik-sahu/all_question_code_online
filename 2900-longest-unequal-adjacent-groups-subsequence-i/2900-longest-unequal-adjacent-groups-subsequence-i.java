class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] group) {
        List<String> ans = new ArrayList<>();
        int n = group.length;
        for(int i=0;i<n;i++){
          if(i==0 || group[i]!=group[i-1]){
            ans.add(words[i]);
          }
        }
        return ans;
    }
}