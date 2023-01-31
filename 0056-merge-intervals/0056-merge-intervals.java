class Solution {
    public int[][] merge(int[][] intervals) {
     ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for( int[] num : intervals){
            if(end>=num[0]){
                end=Math.max(end,num[1]);
            }
            else{
                list.add(new int[]{start,end});
                start=num[0];
                end=num[1];
            }
        }
           list.add(new int[]{start,end});
            return list.toArray(new int[0][0]);
    }
}