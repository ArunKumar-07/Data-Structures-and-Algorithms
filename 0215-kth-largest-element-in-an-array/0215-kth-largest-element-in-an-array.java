class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums.length - k;
        return nums[res];
    }
}
