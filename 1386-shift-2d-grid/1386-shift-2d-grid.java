class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        int[][] newy = new int[m][n];

         k = k%(m*n);
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index = (n*i)+j;
                index=(index+k)%(m*n);
                
                int row = index/n;
                int col=index%n;
                newy[row][col]=grid[i][j];

            }
         }
         for(int i=0;i<m;i++){
                List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(newy[i][j]);
            }
            ans.add(row);
        }
        return ans;

    }
}