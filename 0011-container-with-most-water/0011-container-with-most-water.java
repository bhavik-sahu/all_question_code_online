class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int mheight=Integer.MAX_VALUE;
        int mwidth=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
int l =0,r=n-1;
    while(l!=r){
        mheight=Math.min(height[l],height[r]);
        mwidth=r-l;
        max = Math.max(max ,mheight*mwidth);
        if(mheight==height[l]) l++;
        else r--;
    }
        return max;
    }
}