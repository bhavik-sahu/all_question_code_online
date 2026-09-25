class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int[] arr = new int[52];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            int v = s.charAt(i)-'a';
            if(Character.isUpperCase(s.charAt(i))){
                 v = s.charAt(i)-'a'+32+26;
            }
            arr[v]++;
        }
        int sum=0,max=0;
        for(int i=0;i<52;i++){
            if(arr[i]%2==0)sum+=arr[i];
            else{
                sum+=arr[i]-1;
                max = Math.max(arr[i],max);
            }

        }
        if(max>0)sum++;
        return sum;
    }
}