class Solution {
    private void shift(int i ,int j, int[] nums){
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==0 ){
                for(int j=i+1;j<n;j++){
                    if(nums[j]!=0){
                shift(i,j,nums);
                break;

                    }
                }
                
            }
        }
    }
}