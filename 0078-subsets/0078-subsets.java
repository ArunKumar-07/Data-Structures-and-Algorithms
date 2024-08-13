class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
        find(nums,outer,new ArrayList<>(),0);
        return outer;
    }
void find(int[] nums,List<List<Integer>> outer,List<Integer> list , int start){
    outer.add(new ArrayList<>(list));
    for(int i=start;i<nums.length;i++){
        list.add(nums[i]);
        find(nums,outer,list,i+1);
        list.remove(list.size()-1);
    }
}
}