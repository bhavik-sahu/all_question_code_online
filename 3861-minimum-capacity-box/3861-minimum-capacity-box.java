class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int l = capacity.length;
        int ans = Integer.MAX_VALUE;
        int r=-1;
        for(int i=0;i<l;i++){
            if(capacity[i]<itemSize)continue;
            if(ans<=capacity[i])continue;
            ans = capacity[i];
            r = i;
        }
        return r;
    }
}