class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     
        int n = rooms.size();
        boolean[] visited= new boolean[n];
        dfs(0,visited,rooms);
        for( int i=0;i<visited.length;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    
   void dfs(int key ,boolean[] visited,List<List<Integer>> rooms){
       visited[key]=true;
       for( int it : rooms.get(key)){
           if(!visited[it]){
                dfs(it,visited,rooms);
           }
       }
   }
}