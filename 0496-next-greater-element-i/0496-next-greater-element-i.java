class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        int k =0;
        for(int num : nums2){
            map.put(num , k++);
        }
        for(int i=0;i<nums1.length;i++){
            int find = map.get(nums1[i])  ;
            int ans = -1;
            while(find++ < nums2.length-1){
                if(nums1[i] <  nums2[find]){
                    ans = nums2[find];
                    break;
                }
            }
              result[i] = ans;
        }
                    return result;
    }
}