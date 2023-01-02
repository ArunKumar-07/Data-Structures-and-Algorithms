class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for( int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
           for( int row=1;row<n;row++) {
               for( int col=0;col<n;col++){
                   int min = Integer.MAX_VALUE;
                   //upper check
                   min = Math.min(min,matrix[row][col]+dp[row-1][col]);
                   //left side checks
                   if(col-1>=0) min=Math.min(min,matrix[row][col]+dp[row-1][col-1]);
                   //right side checks
                   if(col+1<=n-1) min=Math.min(min,matrix[row][col]+dp[row-1][col+1]);
                   
                   dp[row][col]=min;
               }
           }
        int ans=Integer.MAX_VALUE;
        for( int i=0;i<n;i++){
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}