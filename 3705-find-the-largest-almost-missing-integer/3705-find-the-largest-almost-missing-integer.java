class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length, maximum = 0;
        int[] count = new int[51];
        for (int t : nums) {
            count[t]++;
            maximum = Math.max(t, maximum);
        }
        if (k == 1) {

            for (int i = maximum; i >= 0; i--) {
                if (count[i] == 1) {
                    return i;
                }
            }
        }
        else if (k==n)return maximum;

        else if(1<k && k<n){
        int max = Math.max(nums[0], nums[n - 1]);
        int min = Math.min(nums[0], nums[n - 1]);

        if((count[max]==1 && count[min]==1 ))return max;
        else if(count[max]>1 && count[min]==1)return min;
        else if(count[min]>1 && count[max]==1)return max;

        else return -1;
        }

return -1;
    }
}