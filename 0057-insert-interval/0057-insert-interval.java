class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int a = intervals.length;
        int[][] ans = new int[a][2];
        int j = 0;
        int st1 = intervals[0][0];
        int ed1 = intervals[0][1];
        for (int i = 1; i < a; i++) {
            int st2 = intervals[i][0];
            int ed2 = intervals[i][1];
            if (ed1 >= st2) {
                ed1 = Math.max(ed1, ed2);
                continue;
            }
            ans[j] = new int[] { st1, ed1 };
            j++;
            st1 = st2;
            ed1 = ed2;
        }
            ans[j] = new int[] { st1, ed1 };
        return Arrays.copyOf(ans,j+1);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int a = intervals.length;

        int[][] ans = new int[a+1][2];
        if(a==0){
            ans[0]=newInterval;
        return ans;
        }
        int j=0;
        boolean insrted=false;
        for(int i=0;i<a;i++){
        if(!insrted && intervals[i][0]>=newInterval[0]){
            ans[j++]=newInterval;
            insrted=true;
        }
        ans[j++]=intervals[i];
        }
        if(!insrted){
            ans[j++]=newInterval;
        }
        return merge(Arrays.copyOf(ans,j));
    }
}