//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends

 class Pair{
        int first ;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }

class Solution {
	//toposort method
   public void topo(Stack<Integer> st ,  int[] visit,	ArrayList<ArrayList<Pair>> adj , int node){
       visit[node]=1;
       for( int i=0;i<adj.get(node).size();i++){
           int it = adj.get(node).get(i).first;
           if(visit[it]==0){
               topo(st,visit,adj,it);
           }
       }
       st.push(node);
   }
	public int[] shortestPath(int N,int M, int[][] edges) {
	ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
	for( int i=0;i<N;i++){
	    adj.add(new ArrayList<Pair>());
	}
	for(int i=0;i<M;i++){
	  int u = edges[i][0];
      int v = edges[i][1];
      int wt = edges[i][2];
      adj.get(u).add(new Pair(v, wt));
	  }
	  Stack<Integer> st= new Stack<>();
	    int[] visit = new int[N];
	   // Arrays.fill(visit,0);
	    for( int i=0;i<N;i++ ){
	        if(visit[i]==0){
	            topo(st,visit,adj,i);
	        }
	    }
	    
	    int[] dist=new int[N];
	    Arrays.fill(dist,(int)1e9);
	    dist[0]=0;
	    while(!st.isEmpty()){
	        int node = st.peek();
	        st.pop();
	        for( int i=0;i<adj.get(node).size();i++){
	           int number = adj.get(node).get(i).first;
               int weight = adj.get(node).get(i).second;
	            
	            if(dist[node]+weight< dist[number]){
	                dist[number]=dist[node]+weight;
	            }
	        }
	    }
	    for( int i=0;i<N;i++){
	        if(dist[i]==1e9){
	            dist[i]=-1;
	        } 
	    }
	    return dist;
	}
}
 



