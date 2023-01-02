class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        
        int[] ans = new int[queries.length];
        for( int i=0;i<queries.length;i++){
            int count=0;
            int sum=0;
            int index=0;
            for( int j=0;j<nums.length;j++){
                if(sum+nums[index]<=queries[i]){
                    sum+=nums[index];
                    count++;
                }
                index++;
            }
            ans[i]=count;
        }
        return ans;
    }
}