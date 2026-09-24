class Solution {
    private int check(int n ){
        int sum=0;
        while(n!=0){
            int temp = n%10;
            sum+=temp;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int total = check(nums[i]);
            if(total==i){
                min = Math.min(min,i);
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        return min;
    }
}