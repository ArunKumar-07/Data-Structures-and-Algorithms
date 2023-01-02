class Solution {
    public int numTilings(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int mod=1000000007;
        long[] dp = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=(2*dp[i-1]+dp[i-3])%mod;
        }
        return (int)dp[n];
    }
}