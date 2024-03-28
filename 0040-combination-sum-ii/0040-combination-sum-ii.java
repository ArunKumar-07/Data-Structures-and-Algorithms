class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    static void findCombination(int index,int[] candidates,int target,ArrayList<Integer> ds,List<List<Integer>> ans ){
        if(target == 0 ) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i= index;i<candidates.length;i++){
            if(  i > index && candidates[i] == candidates[i-1] ) continue;
            if(candidates[i] > target ) break;
            ds.add(candidates[i]);
            findCombination( i +1 , candidates , target - candidates[i],ds,ans);
            ds.remove(ds.size() -1 );
        }
        
    }
}