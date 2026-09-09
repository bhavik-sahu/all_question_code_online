class Solution {
    public long countCommas(long n) {
        long p = 1000,cnt=0;
        while(p<=n){
            cnt+=n-p+1;
            p*=1000;
        }
        return cnt;
    }
}