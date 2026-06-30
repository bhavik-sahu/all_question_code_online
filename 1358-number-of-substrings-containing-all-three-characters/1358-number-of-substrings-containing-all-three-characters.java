class Solution {
    public boolean hasAllChars(int[] freq){
        return freq[0]>0&& freq[1]>0 && freq[2]>0;
    }
    public int numberOfSubstrings(String s) {
        int cnt =0;
        int n = s.length();
        int left =0,right=0;
        int[]freq = new int[3];
        while(right<n){
            char curr = s.charAt(right);
            freq[curr-'a']++;
            while(hasAllChars(freq)){
                cnt+= n-right;
            char leftChar = s.charAt(left);
            freq[leftChar-'a']--;
            left++;
        }
        right++;
            }
            
        return cnt;

        }
    }
