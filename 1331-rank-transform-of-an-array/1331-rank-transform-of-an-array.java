class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
       int[] dup =  Arrays.copyOf(arr,n);
        Arrays.sort(dup);
        HashMap<Integer,Integer> map = new HashMap<>();
        int pp = 1;
        for(int i=0;i<  dup.length;i++){
            if(map.containsKey(dup[i])) continue;
           map.put(dup[i],pp++);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int val = map.get(arr[i]);
            ans[i] = val;
        }
        return ans;
    }
}