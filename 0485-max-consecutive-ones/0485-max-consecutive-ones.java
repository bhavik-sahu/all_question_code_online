class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt =0,currf=0 ;
        for(int n:nums){
            if(n==1)cnt++;
            currf= Math.max(cnt,currf);
            if(n==0 && cnt!=0)cnt=0;
        }
        return currf;
    }
}