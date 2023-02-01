class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
      
        for( int no : map.keySet()){
            if(map.get(no)> nums.length/2){
               return no;
            }
        }
        return -1;
    }
}