class Solution {
    public int minPathSum(int[][] grid) {
     int i = grid.length;
     int j = grid[0].length;
     int[][] dp = new int[i][j];
     return findSum(grid,i-1,j-1,dp);
    }
    int findSum(int[][] grid,int i , int j,int[][] dp){
        if(i==0 && j==0) return grid[i][j];
        if(i < 0 || j<0) return (int)1e9;
         if(dp[i][j]!=0) return dp[i][j];
        int up = grid[i][j]+findSum(grid,i-1,j,dp);
        int left=grid[i][j]+findSum(grid,i,j-1,dp);
        return dp[i][j]=Math.min(up , left);
    }
}