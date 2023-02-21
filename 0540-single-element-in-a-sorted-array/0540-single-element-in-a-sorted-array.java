class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]!=nums[start+1]){
                return nums[start];
            }else{
                start+=2;
            }
        }
        return nums[end];
    }
}