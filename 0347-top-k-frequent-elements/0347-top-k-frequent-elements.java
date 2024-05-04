
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> b[1] - a[1] );
        for(int num : map.keySet()){
            pq.add( new int[]{num,map.get(num)});
        }
        int[] res  = new int[k];
        for(int i=0;i<k;i++){
            int[] arr = pq.poll();
            res[i]=arr[0];
        }
        System.out.println(Arrays.toString(res));
    return res;

    }
}