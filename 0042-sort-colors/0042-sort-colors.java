class Solution {
    private void swap(int a,int b , int[]nums){
        int temp = nums[a];
        nums[a] =nums[b];
        nums[b]=temp; 
    }
    public void sortColors(int[] nums) {
      int n = nums.length;

      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]>nums[j]){
                swap(i,j,nums);
            }
        }
      } 
    }
}