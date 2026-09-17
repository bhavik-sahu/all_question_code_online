class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int right=0,left=0;
        int[] dp = new int[n+1];
            int sum=0;
            int INF=Integer.MAX_VALUE;
            Arrays.fill(dp,INF);
            int ans = INF;
        while(right<n){
            sum+=arr[right];
            right++;
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(right>1){
                dp[right-1]=dp[right-2];
            }
            if(sum==target){
                int length=right-left;
                if(left>0 && dp[left-1]!=INF){
                    ans = Math.min(ans,length+dp[left-1]);
                }
                dp[right-1]=Math.min(dp[right-1],length);
            }
        }
return ans==INF?-1:ans;
    }
}