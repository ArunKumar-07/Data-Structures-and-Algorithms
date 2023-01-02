//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
    int[] degree =new int[V];
    ArrayList<ArrayList<Integer>>  res = new ArrayList<>();
    for( int i=0;i<V;i++){
        res.add(new ArrayList<>());
    }
    for( int i=0;i<V;i++){
        for( int it : adj.get(i)){
            //changes its direction like i--> it to it--> i
            res.get(it).add(i);
            degree[i]++;
        }
    }
    Queue<Integer> qu = new LinkedList<>();
    List<Integer> ans = new ArrayList<>();
    for( int i=0;i<V;i++){
        if(degree[i]==0){
            qu.add(i);
        }
    }
    while(!qu.isEmpty()){
        int node = qu.peek();
        qu.remove();
        ans.add(node);
        for( int it: res.get(node)){
            degree[it]--;
            if(degree[it]==0) qu.add(it);
        }
    }
    Collections.sort(ans);
    return ans;
    
    
    }
}
