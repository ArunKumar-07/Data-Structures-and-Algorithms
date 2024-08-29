class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
       int ans =0;
        for(int i=0;i<nums.length;i++){
            int sum =nums[i];
            for(int j=i+1;j<nums.length;j++){
                ans = Math.max(ans, sum);
                sum*=nums[j];
            }
             ans = Math.max(ans, sum);
        }
        return ans;
    }
}