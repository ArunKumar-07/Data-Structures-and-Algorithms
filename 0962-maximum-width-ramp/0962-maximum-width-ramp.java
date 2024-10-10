class Solution {
    public int maxWidthRamp(int[] nums) {
      int n = nums.length;
        int[] max = new int[n];
        max[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            max[i] = Math.max(nums[i],max[i+1]);
        }
        int left =0;
        int right =0;
        int width =0; 
        while(right < n){
            while(left < right && nums[left] > max[right]){
                left++;
            }
            width = Math.max(width , right - left);
            right++;
        }
        return width;
    }
}