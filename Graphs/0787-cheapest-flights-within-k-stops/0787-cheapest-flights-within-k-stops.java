class Pair{
    int first , second;
    Pair(int first , int second ){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first , second, third;
    Tuple(int first , int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;
    } 
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for( int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for( int i=0;i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        int[] dist= new int[n];
        Arrays.fill(dist,(int)1e9);
        Queue<Tuple> qu = new LinkedList<>();
        qu.add(new Tuple(0,src,0));
        dist[src]=0;
        while(!qu.isEmpty()){
            Tuple dupl = qu.poll();
            int stop=dupl.first;
            int node = dupl.second;
            int cost=dupl.third;
            if(stop > k ) continue;
            for(Pair it : adj.get(node)){
                int adjNode = it.first;
                int distance = it.second;
                if( cost+ distance < dist[adjNode] && stop <=k   ){
                    
                    dist[adjNode]=cost+distance;
                    qu.add(new Tuple(stop+1,adjNode,cost+distance));
                }   
            }
        }
        if(dist[dst]==(int)1e9) return  -1;
        return dist[dst];
    }
}