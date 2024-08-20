class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] ==2){
                    qu.add(new int[]{i,j});
                }
                if(grid[i][j] ==1) fresh++;
            }
        }
        if(fresh ==0 ) return 0;
        int minute =0;
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        while(!qu.isEmpty()){
            int len = qu.size();
            for(int i=0;i<len;i++){
                int[] curr = qu.poll();
                for(int j=0;j<4;j++){
                    int x = curr[0] + dx[j];
                    int y = curr[1] + dy[j];
    if(x<0 ||y<0 || x>=n||y>=m|| grid[x][y]==0 || grid[x][y]==2) continue;
                    if(grid[x][y]==1) fresh--;
                    grid[x][y] =2;
                    qu.add(new int[]{x,y});
                }
            }
            minute++;
        }        
    return fresh ==0 ? minute-1 : -1; 
    }
}