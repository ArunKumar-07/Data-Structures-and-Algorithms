class Solution {
    public List<List<Integer>> permute(int[] nums) {
       return call(new ArrayList<>(),nums); 
    }
    private List<List<Integer>> call(List<Integer> p, int[] nums){
        if(nums.length==0){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int num=nums[0];
        List<List<Integer>> outer = new ArrayList<>();
        for( int i=0;i<=p.size();i++){
            List<Integer> inner = new ArrayList<>();
            inner.addAll(p.subList(0,i));
            inner.add(num);
            inner.addAll(p.subList(i,p.size()));
            outer.addAll(call(inner,Arrays.copyOfRange(nums,1,nums.length)));
        }
        return outer;
    } 

}