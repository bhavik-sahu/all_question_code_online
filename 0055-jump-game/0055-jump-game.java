class Solution {
    public boolean canJump(int[] nums) {
       int n = nums.length,reach=0;
       for(int i=0;i<n;i++){
        if(reach<i)return false;
        else{
            reach = Math.max(reach,i+nums[i]);
            if(reach>=n-1){
                return true;
            }
        }
       } 
       return true;
    }
}