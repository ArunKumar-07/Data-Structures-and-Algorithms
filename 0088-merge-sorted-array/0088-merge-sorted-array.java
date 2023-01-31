class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n==0) return;
      
      int i=m+n-1;
      int j=0;
        while(j<n){
            nums1[i--]=nums2[j++];
        }
        Arrays.sort(nums1);
    }
}