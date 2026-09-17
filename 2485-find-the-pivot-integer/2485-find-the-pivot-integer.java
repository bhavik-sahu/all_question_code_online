class Solution {
    public int pivotInteger(int n) {
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        int lsum=0;
        for(int i=1;i<=n;i++){
            lsum+=i;
            if(lsum==(total-lsum+i)){
                return i;
            }
        }
        return -1;
    }
}