class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
         if (hand.length % groupSize != 0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int number : hand){
         map.put(number,map.getOrDefault(number,0)+1);
        }
        
        while(!map.isEmpty()){
            int startNumber = map.firstKey();
            for(int i=0;i<groupSize;i++){
                int currentNumber = startNumber +i;
                if(!map.containsKey(currentNumber)){
                    return false;
                }
                int number = map.get(currentNumber);
                if(number ==1){
                    //
                    map.remove(currentNumber);
                }else{
                    map.put(currentNumber,map.get(currentNumber)-1);
                }
            }
        }
        return true;
    }
}