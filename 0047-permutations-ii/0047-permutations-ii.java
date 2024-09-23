class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
    permutations(nums,outer,new ArrayList<>(),new boolean[nums.length]);
         return outer;
    }
     static void permutations(int[] nums,List<List<Integer>> outer , ArrayList<Integer> list,boolean[] used ){
        if(list.size() == nums.length) {
            outer.add(new ArrayList<>(list));
            return;
        }else {
            for(int i=0;i< nums.length;i++){
            if( used[i] || i> 0  && nums[i]==nums[i-1] && !used[i-1]) {
                continue;
            }
                list.add(nums[i]);
                used[i] = true;
                permutations(nums,outer,list,used);
                used[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}