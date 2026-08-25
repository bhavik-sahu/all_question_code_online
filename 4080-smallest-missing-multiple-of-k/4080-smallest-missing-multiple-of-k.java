class Solution {
    private boolean exist(int val,int[]nums){
        for(int num:nums){
            if(val==num){
                return true;
            }
        }
        return false;
    }
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        boolean found =false;
        int val =k;
        for(int i=1;i<=1000;i++){
            val = k*i;
            if(!exist(val,nums)){
                return val;
            }
        }
        
       return -1; 
    }
}