class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp =new int[m][n];
        dp[0][0] =1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i ==0 || j ==0 ){
                    dp[i][j]=1;
                    continue;
                }
                int up = dp[i-1][j];
                int right = dp[i][j-1];
                dp[i][j]= up + right;
            }
        }
        return dp[m-1][n-1];
    }
}