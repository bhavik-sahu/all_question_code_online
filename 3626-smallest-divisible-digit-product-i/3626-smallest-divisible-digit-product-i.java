class Solution {
    private int prd (int val){
        int res=1;
        while(val!=0){
            int k = val%10;
            val = val/10;
            res*=k;
        }
        return res;
    }
    public int smallestNumber(int n, int t) {
        int prod = prd(n);
        if(prod%t==0)return n;
        else return smallestNumber(n+1,t);
        
    }
}