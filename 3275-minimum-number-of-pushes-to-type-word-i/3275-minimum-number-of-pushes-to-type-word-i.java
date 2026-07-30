class Solution {
    public int minimumPushes(String word) {
        int l = word.length(),sum=0;
       for(int i=1;i<=l;i++){
        int k =(i-1)/8+1;
        sum +=k;
       }
       return sum;
    }
}