class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k =(long) k1+k2;
        int max =-1;
        long total=0;
        int[] diff = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            max=Math.max(max,diff[i]);
            total+=diff[i];

        }
        if(total<=k)return 0;
        int left=0,right=max;
        while(left<right){
            int mid = left+(right-left)/2;
            long opr =0;
            for(int d:diff){
                if(d>mid){
                    opr +=d-mid;
                }
            }
            if(opr<=k){
                right=mid;
            }
            else{
                left=mid+1;
            }

        }
        int t =left;
        long remain = k;
        for(int d:diff){
            if(d>t){
                remain-=d-t;
            }
        }
        long result =0;
        for(int d : diff){
            d=Math.min(d,t);
            if(d==t && remain>0){
                d--;
                remain--;
            }
            result+=(long) d*d;

        }
        return result;
    }
}