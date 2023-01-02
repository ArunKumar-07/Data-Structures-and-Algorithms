class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp =new int[n][m];
        for( int[] no : dp){
            Arrays.fill(no,-1);
        }
        return lcm(text1,text2,dp,n-1,m-1);
    }
    int lcm(String s1 , String s2 , int[][] dp, int n, int m ){
        if( n<0 || m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m]; 
        
        if(s1.charAt(n) == s2.charAt(m)){
            return dp[n][m]=1+lcm(s1,s2,dp,n-1,m-1);
        }
        else{
            return dp[n][m]=Math.max(lcm(s1,s2,dp,n-1,m) , lcm(s1,s2,dp,n,m-1)); 
        }
    }
}