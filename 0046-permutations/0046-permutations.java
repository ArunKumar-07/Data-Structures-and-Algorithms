class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        permutation(nums,outer,new ArrayList<>());
        return outer;
    }
    static void permutation(int[] nums,List<List<Integer>> outer,ArrayList<Integer> list){
        if(list.size()== nums.length){
            outer.add(new ArrayList<>(list));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
               if(list.contains(nums[i])) continue;
                list.add(nums[i]);
                permutation(nums,outer,list);
                list.remove(list.size()-1);
            }
        }
    }
}