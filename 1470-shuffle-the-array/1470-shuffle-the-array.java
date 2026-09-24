class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
            int j = n;
            int[] arr = new int[len];
            int k=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                arr[i]=nums[k];
                k++;
            }
            else{
                arr[i]=nums[j];
                j++;
            }
        }
        return arr;
    }
}