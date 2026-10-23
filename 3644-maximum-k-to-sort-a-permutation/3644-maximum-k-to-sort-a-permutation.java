class Solution {
    public int sortPermutation(int[] nums) {
        boolean flag = false;
        int n = nums.length,k=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                flag = true;
                k=k&nums[i];
            }
        }
        if(flag ==false)return 0;
        return k;
    }
}