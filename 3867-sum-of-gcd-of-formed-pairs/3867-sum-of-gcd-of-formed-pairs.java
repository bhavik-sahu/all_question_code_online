class Solution {
    private int gcd(int nums,int max){
        int a =nums;
        int b = max;
        while(b!=0){

        int temp=a;
        a=b;
        b=temp%b;
        }
        return a;

    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGCD = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
            prefixGCD[i]=gcd(nums[i],max);
        }
    Arrays.sort(prefixGCD);
long sum=0;
    for(int i=0;i<n/2;i++){
        
            if(i!=(n-i)-1){
            sum+=gcd(prefixGCD[i],prefixGCD[(n-i)-1]);
            }
        
    }
    return sum;
    }
}