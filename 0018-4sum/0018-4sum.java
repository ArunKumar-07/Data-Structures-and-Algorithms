class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for( int i=0;i<nums.length;i++){
            for( int j=i+1;j<nums.length;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[left];
                    sum+=nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum < target){
                      left++;  
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;
     }
}