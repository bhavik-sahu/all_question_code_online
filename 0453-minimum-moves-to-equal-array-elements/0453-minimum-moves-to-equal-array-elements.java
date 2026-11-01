class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length,min =Integer.MAX_VALUE,cnt=0;
        for(int k:nums){
min=Math.min(min,k);
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-min;
            cnt+=nums[i];
        }
        return cnt;
    }
}