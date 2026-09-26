class Solution {
    public int heightChecker(int[] heights) {
        int[] sort = heights.clone();
        int cnt=0;
        Arrays.sort(sort);
        for(int i=0;i<heights.length;i++){
            if (heights[i]!=sort[i])cnt++;
        }
        return cnt;
    }
}