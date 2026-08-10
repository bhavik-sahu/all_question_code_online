class Solution {
    int[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(0,cost),solve(1,cost));

    }
    public int solve(int n,int[] cost){
        
        if(n>=cost.length)return 0;
        else if(dp[n]!=-1)return dp[n]; 

        int a =cost[n]+solve(n+1,cost);
        int b = cost[n]+solve(n+2,cost);
        int c = Math.min(a,b);
        dp[n]=c;
        
        
           
return dp[n];
    }
}