class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
       // Arrays.sort(nums);
        find(nums,new ArrayList<>(),outer ,0);
        return outer;
    }
   void find(int[] nums,ArrayList<Integer> tempList,List<List<Integer>> outer ,int start){
        outer.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            find(nums,tempList,outer,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}