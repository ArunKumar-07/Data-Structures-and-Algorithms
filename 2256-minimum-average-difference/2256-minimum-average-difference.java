class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
           if(n==1) return 0;
        long  sum=0 , left=0;
        int ans=0;
        for( int number : nums) sum+=number;
        long min =Long.MAX_VALUE;
        for( int i=0;i<n;i++){
            left+=nums[i];
            sum-=nums[i];
            long rightAvgValue=0;
            long leftAvgValue=left/(i+1);
            if(i!=n-1)  rightAvgValue=sum/(n-1-i);
            if(Math.abs(leftAvgValue-rightAvgValue)<min){
                min=Math.abs(leftAvgValue-rightAvgValue);
                ans=i; 
            }
        }
        return ans;
    }
}