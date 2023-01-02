class Solution {
    public int maxProfit(int[] prices) {
    int[][] dp=new int[prices.length][2]; 
   // Arrays.fill(dp,-1);
    return profit(0,0,prices,dp);  
    }
    int profit(int index, int buy  , int[] prices, int[][] dp){
        if(index>=prices.length) return 0;
        if(dp[index][buy]!=0) return dp[index][buy];
        int answer=0;
        if(buy==0){
    answer=Math.max(0+profit(index+1,0,prices,dp) ,-prices[index]+profit(index+1,1,prices,dp));
        }
        else{
         answer=Math.max(0+profit(index+1,1,prices,dp), prices[index]+profit(index+2,0,prices,dp));
        }
        return dp[index][buy]=answer;
    }
}