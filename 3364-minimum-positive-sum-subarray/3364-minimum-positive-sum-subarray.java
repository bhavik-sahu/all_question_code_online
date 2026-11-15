class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] pre=new int[n+1];
        
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+nums.get(i-1);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+l-1;j<n && j<=r+i-1;j++){
                int sum = pre[j+1]-pre[i];
                if(sum>0)
                ans = Math.min(sum,ans);


            }
        }
            return ans==Integer.MAX_VALUE?-1:ans;

    }
}