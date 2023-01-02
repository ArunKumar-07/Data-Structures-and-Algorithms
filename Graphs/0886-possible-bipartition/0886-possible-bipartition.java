class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int m = dislikes.length;
        for( int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for( int[] no : dislikes){
            adj.get(no[0]).add(no[1]);
            adj.get(no[1]).add(no[0]);
        }
        int[] color=new int[n+1];
        Arrays.fill(color,-1);
       for( int i=1 ;i<=n;i++){
           if(color[i]==-1){
               if(!possible(i,0,adj,color)) return false;
           }
       }
        return true;    
    }
    boolean possible( int node ,int newColor,ArrayList<ArrayList<Integer>> adj , int[] color){
        color[node]=newColor;
        for( int it : adj.get(node)){
          if(color[it]==color[node]){
              return false;
          }
          if(color[it]==-1){
              if(!possible(it,1-newColor,adj,color)) return false;
          }
        }
        return true;
    }
}