class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point = m+n-1;
       for(int i=0;i<nums2.length;i++){
           nums1[point--]=nums2[i];
       }
        Arrays.sort(nums1);
    }
}