class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
       int prefix =1;
       int suffix=1;
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0)suffix=1;
            prefix*=nums[i];
            suffix*=nums[n-i-1];
            ans = Math.max(ans , Math.max(prefix,suffix));
        }
        return ans;
    }
}