class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int l= capacity.length;
        int[] sorted = capacity.clone();
        Arrays.sort(sorted);
        int ans = -1;
        for(int n:sorted){
            if(n>=itemSize){
                ans=n;
                break;
            }
        }
        for(int i=0;i<l;i++){
            if(capacity[i]==ans){
                return i;
            }
        }
return -1;
    }
}