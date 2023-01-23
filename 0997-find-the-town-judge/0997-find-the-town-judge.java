class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count1=new int[n+1];
        int[] count2=new int[n+1];
        for( int[] no:trust){
            count1[no[0]]++;
            count2[no[1]]++;
        }
        for(int i=1;i<count1.length;i++){
            if(count1[i]==0 && count2[i]==n-1) return i;
        }
        return -1;
    }
}