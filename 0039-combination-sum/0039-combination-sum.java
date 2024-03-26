class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    static void findCombination(int index,int[] candidates,int target,ArrayList<Integer>  ds,List<List<Integer>> ans ){
     if(index == candidates.length){
         if(target == 0){
             ans.add(new ArrayList<>(ds));
         }
         return;
     }
      //  if(target == 0) ans.add(ds);
        if( candidates[index] <= target){
            ds.add(candidates[index]);
            findCombination(index,candidates,target-candidates[index],ds,ans);
            ds.remove(ds.size()-1);
        }
        findCombination(index+1,candidates,target,ds,ans);
    }
}