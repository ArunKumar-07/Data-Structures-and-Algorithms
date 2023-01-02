//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}
// } Driver Code Ends

class Pair{
    int node;
    int distance;
   public Pair(int distance, int node){
        this.node=node;
        this.distance=distance;
    }
}
class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        PriorityQueue<Pair> qu =  new PriorityQueue<Pair>((x,y)-> x.distance - y.distance);
        int[] visited=new int[V];
        qu.add(new Pair(0,0));
        int sum=0;
        while(qu.size()>0){
            int wt=qu.peek().distance;
            int node = qu.peek().node;
            qu.remove();
            if(visited[node]==1) continue;
            visited[node]=1;
            sum+=wt;
            for( int i=0;i<adj.get(node).size();i++){
                int adjwt=adj.get(node).get(i).get(1);
                int adjNode=adj.get(node).get(i).get(0);
                if(visited[adjNode]==0){
                    qu.add(new Pair(adjwt,adjNode));
                }    
            }
        }
          return sum;
    }
}
