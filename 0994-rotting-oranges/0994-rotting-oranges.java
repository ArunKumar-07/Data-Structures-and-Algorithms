class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<int[]> qu = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2 ){
                    qu.offer(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;    
                }
            }
        }
        if(fresh == 0) return 0;
        int countTime = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        while(!qu.isEmpty()){
            int size = qu.size();
            for(int i=0;i<size;i++){
                int[] value = qu.poll();
                for(int j=0;j<4;j++){
                    int x = value[0] + dx[j];
                    int y = value[1] + dy[j];
                    if(x < 0 || y < 0 || x>=n || y >=m || grid[x][y] ==2 || grid[x][y] ==0 ) continue;
                    if(grid[x][y] ==1 ) fresh--;
                    grid[x][y] =2 ;
                    qu.offer(new int[]{x,y});
                }
            }
            if(qu.size() != 0) countTime++;
        }
        return fresh == 0 ? countTime : -1;
   
    }
}