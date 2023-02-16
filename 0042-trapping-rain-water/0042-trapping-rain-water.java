class Solution {
    public int trap(int[] height) {
        int water=0 ,i=0,j=height.length-1, left=0,right=0;
        
        while(i<j){
            if(height[i]<=height[j]){
                left=Math.max(left,height[i]);
                water+=left-height[i];
                i++;
            }else{
                right=Math.max(right,height[j]);
                water+=right-height[j];
                j--;
            }
        }
        return water;
    }
}