class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner =  new ArrayList<>();
        inner.add(0);
      dfs(graph,graph.length-1,inner,outer,0);
        return outer;
    }
    void dfs(int[][] graph,int dest,List<Integer> inner ,List<List<Integer>> outer , int src  ){
        if(src==dest){
            outer.add(new ArrayList(inner));
            return;
        }
         for(int it: graph[src]){
             inner.add(it);
             dfs(graph,dest,inner,outer,it);
            inner.remove(inner.size()-1);
         }
    }
}