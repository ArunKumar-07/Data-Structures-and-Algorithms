class Solution {
    public int findCircleNum(int[][] isConnected) {
       boolean[] visit = new boolean[isConnected.length];
        int province =0;
        for(int i=0;i<visit.length;i++){
            if(visit[i]== false){
                dfs(isConnected,visit,i);
                province++;
            }
        }
        return province;
    }
    void dfs(int[][] isConnected,boolean[] visit, int i){
        if(visit[i]) return;
        visit[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && j!=i){
                dfs(isConnected,visit,j);
            }
        }
    }
}