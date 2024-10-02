class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int pp = 1;
        for(int num :set ){
           map.put(num,pp++);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int val = map.get(arr[i]);
            ans[i] = val;
        }
        return ans;
    }
}