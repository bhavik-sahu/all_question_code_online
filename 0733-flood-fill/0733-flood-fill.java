class Solution {
    private void dfs(int sr,int sc,int inicolor,int[][] ans,int[][] image,int[] delrow, int[] delcol,int newcolor){
    ans[sr][sc]= newcolor;
    int n = ans.length;
    int m = ans[0].length;
    for(int i=0;i<4;i++){
        int nrow = sr+delrow[i];
        int ncol = sc+delcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=newcolor){
         dfs(nrow,ncol,inicolor,ans,image,delrow,delcol,newcolor);   
        }
    }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int inicolor = image[sr][sc];
    int[][] ans= image;
    int[] delrow={-1,0,+1,0};
    int[] delcol = {0,+1,0,-1};
    dfs(sr,sc,inicolor,ans,image,delrow,delcol,color);
    return ans;
    }
}