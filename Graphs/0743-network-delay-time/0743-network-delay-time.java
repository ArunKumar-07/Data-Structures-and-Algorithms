class Pair{
    int first;
    int second;
 public   Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for( int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for( int i=0;i<times.length;i++){
          adj.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }
    
        int[] dist= new int[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[k]=0;
        PriorityQueue<Pair> qu = new PriorityQueue<Pair>((x,y)-> x.second - y.second);
        qu.add(new Pair(k,0));
        while(!qu.isEmpty()){
            
            int size = qu.size();
            Pair it = qu.poll();
            int node = it.first;
            int cost = it.second;
          for(Pair iter : adj.get(node)){
             int adjNode=iter.first;
             int wt =iter.second;
              
              if( cost+wt <  dist[adjNode]){
                    dist[adjNode] = cost+wt;
                  qu.add(new Pair(adjNode,cost+wt));
              }
          }
        }
        int res=0;
        
        for( int i=1;i<dist.length;i++){
          res=Math.max(res,dist[i]);
        }
        
        return res==(int)(1e9) ? -1 : res;
    }
}