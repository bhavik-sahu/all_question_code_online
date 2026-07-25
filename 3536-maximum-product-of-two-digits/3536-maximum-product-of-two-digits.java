class Solution {
    public int maxProduct(int n) {
        int max =0,smax=0;
        while(n!=0){
            int k = n%10;
            n=n/10;
            if (k > max) {
    smax = max;
    max = k;
} else if (k > smax) {
    smax = k;
}
            
        }
    return max*smax;
    }
}