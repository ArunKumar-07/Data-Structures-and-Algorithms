class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visit = new boolean[isConnected.length];
        int res=0;
        for( int i=0;i<visit.length;i++){
            if(visit[i]==false){
                dfs(isConnected,i,visit);
                res++;
            }
        }
        return res;
    }
    private void dfs(int[][] isConnected,int i,boolean[] visit){
        if(visit[i]) return;
        visit[i]=true;
        for( int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && j!=i){
                dfs(isConnected,j,visit);
            }
        }
    }
}