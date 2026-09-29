class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftm= new int[n];
        int[] rightm= new int[n];
        int lmax = -1,rmax=-1;
        for(int i=0;i<n;i++){
            lmax=Math.max(height[i],lmax);
            rmax=Math.max(height[n-i-1],rmax);
            leftm[i]=lmax;
            rightm[n-1-i]=rmax;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(leftm[i],rightm[i])-height[i];
        }
        return sum;
    }
}