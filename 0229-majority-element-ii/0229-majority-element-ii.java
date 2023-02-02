class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
      
        for( int no : map.keySet()){
            if(map.get(no)>nums.length/3){
               list.add(no);
            }
        }
        // if(list.size()>0) return list;
        // for(int no : nums) list.add(no);
        return list;
    }
}