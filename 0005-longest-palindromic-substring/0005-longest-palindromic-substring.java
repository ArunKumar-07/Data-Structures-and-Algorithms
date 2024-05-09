class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for(int diff= 0 ; diff < n ;diff++){
            for(int i=0,j=diff ; j<n;i++,j++){
                if( i == j) dp[i][j] = true;
                else if(diff ==1 ){
                dp[i][j] = s.charAt(i) == s.charAt(j) ;
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }
                if(dp[i][j]){
                    ans = s.substring(i,j+1);
                }
                }
            }
         return ans;
    }
}