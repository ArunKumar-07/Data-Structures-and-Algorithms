class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();
        
        for( int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        int[] indegree= new int[numCourses];
        for( int i=0;i<numCourses;i++){
            for( int it : adj.get(i)){
            indegree[it]++;
            }
        }
        Queue<Integer> qu = new LinkedList<>();
        for( int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                qu.add(i);
            }
        }
        int count =0;
        while(!qu.isEmpty()){
            int node = qu.peek();
            qu.remove();
            count++;
            
            for( int it : adj.get(node)){
             indegree[it]--;
                if(indegree[it]==0){
                    qu.add(it);
                }
            }
        }
        return count==numCourses ? true : false;
        
    }
}