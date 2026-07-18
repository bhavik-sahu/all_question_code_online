class Solution {
    private int gcd (int a ,int b){
        while(b!=0){

        int temp =a;
        a=b;
        b=temp%b;
        }
        return a ;
    } 
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return gcd(nums[0],nums[n-1]);
    }
}