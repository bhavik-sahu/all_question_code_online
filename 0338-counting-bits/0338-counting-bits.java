class Solution {
    private int get(int i){
        int cnt=0;
        while(i>0){
            i=i&i-1;
            cnt++;
        }
        return cnt;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=get(i);
        }
        return ans;
    }
}