class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count=new int[n+1];
        for( int[] no:trust){
            count[no[0]]--;
            count[no[1]]++;
        }
        for(int i=1;i<count.length;i++){
            if(count[i]==n-1) return i;
        }
        return -1;
    }
}