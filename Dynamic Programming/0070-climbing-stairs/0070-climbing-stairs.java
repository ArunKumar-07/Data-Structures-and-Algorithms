class Solution {
    
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return find(n,dp);
    }
    int find(int n,int[] dp ){
        // if(n==1) dp[n]=1;
        // if(n==2) dp[n]=2;
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n]; 
        int left = find(n-1,dp);
        int right = find(n-2,dp);
        return dp[n]=left+right;
        
    }
}