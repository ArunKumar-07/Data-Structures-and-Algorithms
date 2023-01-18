class Solution {
    public int maxSubarraySumCircular(int[] nums) {
     int max1=find(nums);
        int acc=0;
        for(int i=0;i<nums.length;i++){
            acc+=nums[i];
            nums[i]=-nums[i];
        }
        int min=find(nums);
        int max2=acc+min;
        if(max2==0) return max1;
        return Math.max(max1,max2);
    }
    int find(int[] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for( int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        return max;
    }
}