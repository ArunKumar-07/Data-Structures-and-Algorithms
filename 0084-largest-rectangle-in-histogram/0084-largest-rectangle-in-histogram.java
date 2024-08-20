class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int[] leftPrev = new int[n];
       leftPrev[0]=-1;
       int[] rightPrev = new int[n];
       rightPrev[n-1] =n;
        for(int i=1;i<n;i++){
         int p = i-1;
            while(p>=0 && heights[p] >= heights[i]){
                p = leftPrev[p];
            }
            leftPrev[i] =p;
        }
        for(int i=n-2;i>=0;i--){
            int p = i+1;
            while(p<n && heights[p] >= heights[i]){
                p = rightPrev[p];
            }
            rightPrev[i] =p;
        }
        int max =0;
        for(int i=0;i<n;i++){
            max = Math.max(max ,heights[i] * (rightPrev[i] - leftPrev[i]-1));
        }
        return max;
    }
}