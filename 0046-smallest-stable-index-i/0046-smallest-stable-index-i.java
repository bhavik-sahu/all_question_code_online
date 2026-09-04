class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max =Integer.MIN_VALUE;
        int ans =-1;
        int min =Integer.MAX_VALUE;
        boolean onetime = true;
        for(int i=0;i<n;i++){
                min =Integer.MAX_VALUE;
            for(int j =0;j<=i;j++){
                max = Math.max(max,nums[j]);
            }
            for(int j =i;j<n;j++){
                min = Math.min(min,nums[j]);
            }
int h =max-min;
if(h<=k && onetime){
    ans=i;
    onetime=false;   
        }
    }
        return ans;
}
}