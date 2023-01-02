class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for( int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] no : edges){
            adj.get(no[0]).add(no[1]);
            adj.get(no[1]).add(no[0]);
        }
        int[] count = new int[n];
        int[] answer= new int[n];
        dfs1(0,-1,adj,count,answer);
        dfs2(0,-1,adj,count,answer);
        return answer;
    }
    void dfs1(int node,int parent,ArrayList<ArrayList<Integer>> adj,int[] count,int[] answer ){
        for( int it : adj.get(node)){
            if(it == parent ) continue; // for avoiding loops
            dfs1(it,node,adj,count,answer);
            count[node]+=count[it];
            answer[node]+=answer[it]+count[it];
        }
        count[node]++;
    }
     void dfs2(int node,int parent,ArrayList<ArrayList<Integer>> adj,int[] count,int[] answer ){
         for( int it : adj.get(node)){
             if(it== parent ) continue ; 
             answer[it]=answer[node]-count[it]+count.length-count[it];
             dfs2(it,node,adj,count,answer);
         }
     }
}