class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
     double ans =0.0;
        int len = list.size();
        if( len% 2 ==0){
            ans = ( list.get(len/2 -1) + list.get(len/2) )  / 2.0;
        }else{
            ans = list.get(len/2) ;
        }
        return ans;
    }
}
 
// 0 0 0 0 0 
    
//     1 2 3 