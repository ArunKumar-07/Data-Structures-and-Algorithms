class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
     PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(b)- map.get(a));
        pq.addAll(map.keySet());
        Queue<Integer> qu = new LinkedList<>();
        int first = map.get(pq.peek());
        while(!pq.isEmpty()){
            int curr = pq.poll();
            if(first==map.get(curr)){
                qu.add(curr);
            }
        }
        int ans =Integer.MAX_VALUE;
        while(!qu.isEmpty()){
            int temp = qu.poll();
             int freq = map.get(temp);
             int start =0;
            int end =0;
            for(int i=0;i<nums.length;i++){
                if(freq == 0) break;
                if(nums[i]==temp){
                    freq--;
                    if(freq == map.get(temp) -1 )  start = i;
                    if(freq ==0) end =i;
                }
            }
             ans = Math.min(ans , end - start +1);
        }
        return ans;
    }
}
