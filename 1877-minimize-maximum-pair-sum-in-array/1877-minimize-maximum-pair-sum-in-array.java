    class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int j = nums.length -1 ;
        for(int i=0;i< nums .length /2 ;i++){
            int a = nums[i] + nums[j];
            max = Math.max(max , a);
            j--;
        }
        return max;
    }
} // 2 3 4 4 5  6