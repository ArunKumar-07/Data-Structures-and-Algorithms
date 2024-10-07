class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> outer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
         for(int i=0;i<nums.length;i++){
             int j=i+1;
             int k =nums.length-1;
             while(j < k){
                 int value = nums[i] + nums[j] + nums[k];
                 if(value ==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k])); 
                     j++;
                     k--;
                 }
                  else if(value > 0 ){
                     k--;
                 }else{
                      j++;
                  }
             }
         }
          outer.addAll(set);
        return outer;
    }
}