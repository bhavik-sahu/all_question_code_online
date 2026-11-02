class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int med;
        if(n%2!=0){
            med = nums[((n+1)/2)-1];

        }else{
            int a = nums[n/2];
            int b = nums[(n+1)/2];
            med=(a+b)/2;
        }int ans =0;
        for(int k:nums){
ans+=Math.abs(med-k);
        }
        return ans;
    }
}