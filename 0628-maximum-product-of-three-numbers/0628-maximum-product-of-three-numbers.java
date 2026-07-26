class Solution {
    public int maximumProduct(int[] nums) {
        int max =Integer.MIN_VALUE,smax=Integer.MIN_VALUE,tmax=Integer.MIN_VALUE,min = Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int n:nums){
            int k =n;

            if(k<min){
            smin=min;
            min =k;

            }
            else if(k<smin){
                smin=k;
            }
            
            if(k>max){
                tmax = smax;
                smax = max;
                max = k;

            }
            else if(k>smax){
                tmax = smax;
                smax = k;
            }
            else if(k>tmax){
                tmax =k;
            }
        }
        Arrays.sort(nums);
        return Math.max(max*smax*tmax,max*min*smin);
    }
}