class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        int[] parent=new int[n];
        for( int i=0;i<n;i++) parent[i]=i;
        int cycle=0;
        int unConnected=0;
            
         for( int[] link : connections){
             int firstNode  = link[0];
             int secondNode = link[1];
             if(findParent(firstNode,parent) == findParent(secondNode,parent)) cycle++;
             union(firstNode,secondNode,parent);
         }
        for( int i=0;i<parent.length;i++){
            if(parent[i]==i) unConnected++;
           }
        if(cycle >=unConnected-1) return unConnected-1;
        return -1;
        
    }
    public int findParent(int node , int[] parent){
        if(parent[node]==node) return node;
        return findParent(parent[node],parent); 
}
    public void union(int firstNode,int secondNode,int[] parent){
        firstNode=findParent(firstNode,parent);
        secondNode=findParent(secondNode,parent);
        parent[secondNode]=firstNode;
    }
}