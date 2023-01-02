class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for( int num : nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int target = sum/2;
        int[][] dp =  new int[nums.length][target+1];
        for( int[] no : dp){
            Arrays.fill(no,-1); 
        }
        return find(nums.length-1,target,nums,dp);
    }
    boolean find(int index,int target , int[] nums,int[][] dp ){
        if(target==0) return true;
        if(index==0) return nums[0]==target; 
        if(dp[index][target]!=-1) return dp[index][target]==0 ? false : true;
        boolean notTake=find(index-1,target,nums,dp);
        boolean take=false;
       if(nums[index]<=target){
        take = find(index-1,target-nums[index],nums,dp);
        dp[index][target]=notTake||take?1:0;
       }
    return notTake||take;
    }
}