class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
      int n=edges.length;
      int[] dist1=new int[n];
      int[] dist2=new int[n];
      boolean[] visit1= new boolean[n];
      boolean[] visit2=new boolean[n];
        dfs(node1,edges,dist1,visit1);  
        dfs(node2,edges,dist2,visit2);
        int ans =-1;
        int min=Integer.MAX_VALUE;
        for( int i=0;i<n;i++){
            if(visit1[i]&&visit2[i]&&min>Math.max(dist1[i],dist2[i])){
                min=Math.max(dist1[i],dist2[i]);
                ans=i;
            }
        }
        return ans;
        
    }
    void dfs(int node,int[] edges,int[] dist,boolean[] visit){
        visit[node]=true;
        int it=edges[node];
        if(it!=-1 && visit[it]==false){
          dist[it]=1+dist[node];
            dfs(it,edges,dist,visit);
        }
    }
}