class Solution {
public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> outer = new ArrayList<>();
    find(outer,new ArrayList<>(),nums);
    return outer;
}
    static  void find(List<List<Integer>> outer , List<Integer> list , int[] nums){
        if(list.size() == nums.length) {
            outer.add(new ArrayList<>(list));
            return;
        }else {
            for(int i=0;i< nums.length;i++){
                if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                find(outer,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}