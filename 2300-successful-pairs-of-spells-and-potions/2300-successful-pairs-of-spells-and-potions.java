class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      int n = spells.length;
      int m = potions.length;
      int[] ans = new int[n];
        Arrays.sort(potions);
        
        for( int i=0;i<n;i++){
            int first=spells[i];
            int left=0;
            int right=m-1;
            while(left<=right){
            int mid=left+(right - left)/2;
            long product = (long)first * potions[mid];
                if(product >= success){
                   right=mid-1; 
                }
                else{
                    left=mid+1;
                }
            }
            ans[i]=m-left;
        }
        return ans;
    }
}