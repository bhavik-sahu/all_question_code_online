class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor =nums[0];
        boolean hasnon=false;
        for(int i=1;i<n;i++){
            xor=xor^nums[i];
            if(nums[i]!=0)hasnon=true;
        }
        if(xor!=0)return n;
else if(hasnon)return n-1;        
        
        return 0;
    }
}