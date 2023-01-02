class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i=0;i<n;i++) adj.add(new ArrayList<>());
        
        for(int[] edge : edges){
         adj.get(edge[0]).add(edge[1]);
         adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited=new boolean[n];
        return dfs(adj,visited,source,destination);
    }
    boolean dfs( ArrayList<ArrayList<Integer>> adj ,boolean[] visited, int source , int destination){
        if(source==destination) return true;
        if(visited[source]==true) return false;
        visited[source]=true;
        for(int it : adj.get(source)){
            if(dfs(adj,visited,it,destination)) return true;
        }
        return false;   
    }
}