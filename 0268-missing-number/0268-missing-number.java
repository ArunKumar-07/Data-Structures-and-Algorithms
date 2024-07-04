class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0] !=0) return 0;
        if(nums[n-1] != n) return n;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+1 != nums[i+1]){
               return nums[i]+1;
            }
        }
        return 0;
    }
}