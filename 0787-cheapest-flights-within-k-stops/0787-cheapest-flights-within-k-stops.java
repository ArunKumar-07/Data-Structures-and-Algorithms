class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
    class Tuple{
        int first;
        int second;
        int third;
        Tuple(int first,int second,int third){
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
       
        int m=flights.length;
        for( int i=0;i<m;i++){
           adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<Tuple> qu=new LinkedList<>();
        int[] dist=new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        qu.add(new Tuple(0,src,0));
        while(!qu.isEmpty()){
            Tuple remov=qu.poll();
            int stop=remov.first;
            int node=remov.second;
            int distance=remov.third;
            if(stop>k) continue;
            for(Pair it : adj.get(node)){
                int nextNode=it.first;
                int nextDistance=it.second;
                if(stop<=k && dist[nextNode]>distance+nextDistance){
                    dist[nextNode]=distance+nextDistance;
                    qu.add(new Tuple(stop+1,nextNode,distance+nextDistance));
                }
            }
        }
        if(dist[dst]==(int)1e9) return -1;
        return dist[dst];
    }
}