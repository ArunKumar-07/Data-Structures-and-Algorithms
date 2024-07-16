class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!dfs(graph,i,0,color)) return false;
            }
        }
        return true;
    }
    boolean dfs(int[][] graph ,int node , int number ,int[] color){
        color[node]= number;
        for(int it : graph[node]){
            if(color[it]==-1){
                if(!dfs(graph,it,1-color[node],color)) return false;
            }else{
                if(color[it]== number) return false;
            }
        }
        return true;
    }
}