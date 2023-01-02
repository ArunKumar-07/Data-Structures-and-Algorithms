class Solution {
    public int orangesRotting(int[][] grid) {
    if(grid==null ||  grid.length==0 ) return -1;    
        
        for( int i=0;i<grid.length;i++){
            for( int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)  dfs(grid,i,j,2);
            }
        }
        int minutes=2;
        for( int [] row : grid){
            for( int value : row){
                if(value==1) return -1; 
                minutes=Math.max(minutes,value);
            }
        }
        return minutes-2;
    }
    private void dfs(int[][] grid,int i , int j , int minutes ){
        if(i < 0 || i>=grid.length 
        || j<0 || j>=grid[0].length 
        || grid[i][j]==0
        || (1<grid[i][j] && grid[i][j]<minutes)
          )  return ;
        else{
            grid[i][j]=minutes;
            dfs(grid, i-1, j, minutes+1);
            dfs(grid, i+1, j, minutes+1);
            dfs(grid, i ,j-1, minutes+1);
            dfs(grid, i ,j+1, minutes+1);
        }
    }
}