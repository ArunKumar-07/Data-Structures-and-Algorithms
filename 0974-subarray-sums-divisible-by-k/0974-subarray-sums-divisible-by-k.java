class Solution {
    public int subarraysDivByK(int[] nums, int k) {
          int sum=0;
        int count=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        for( int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%k;
            if(sum<0) sum+=k;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}