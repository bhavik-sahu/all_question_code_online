class Solution {
    private void dfs (int i, boolean[] vis,ArrayList<ArrayList<Integer>> adjls) {
        if(vis[i]!=true){

        vis[i]=true;
        for(int j: adjls.get(i)){
            dfs(j,vis,adjls);
        }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length,cnt=0;

        ArrayList<ArrayList<Integer>> adjls = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adjls.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }



        boolean[] vis = new boolean[n+1];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                cnt++;
                dfs(i,vis,adjls);
            }
        }
        return cnt;
    }
}