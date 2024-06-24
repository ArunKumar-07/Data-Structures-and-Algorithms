class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int water =0;
        while( i < j){
            if(height[i] <= height[j]){
                leftMax = Math.max(leftMax , height[i]);
                water+=leftMax - height[i];
                i++;
            }else{
                rightMax = Math.max(rightMax , height[j]);
                water+=rightMax - height[j];
                j--;
            }
            
        }
        return water;
    }
}