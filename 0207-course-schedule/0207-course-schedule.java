class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] inDegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it : list.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i] ==0) qu.add(i);
        }
        int count =0;
        while(!qu.isEmpty()){
            int current = qu.poll();
            count++;
            for(int it : list.get(current)){
                inDegree[it]--;
                if(inDegree[it]==0) qu.add(it);
            }
        }
        return count == numCourses ? true : false;
        
        
    }
}