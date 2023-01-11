class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for( int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] value :edges){
            adj.get(value[0]).add(value[1]);
            adj.get(value[1]).add(value[0]);
        }
        boolean[] visit  = new boolean[n];
        Arrays.fill(visit,false);
        return dfs(0,adj,hasApple,visit); 
    }
     int dfs(int node,ArrayList<ArrayList<Integer>> adj,List<Boolean> hasApple,boolean[] visit){
         if(visit[node]) return 0;
         visit[node]=true;
         int noOfNode=0;
         for( int it : adj.get(node)){
            noOfNode+=dfs(it,adj,hasApple,visit);
                  
         }
         if(node!=0 && (hasApple.get(node)|| noOfNode>0 )) noOfNode+=2;
         return noOfNode;
         
     }
}