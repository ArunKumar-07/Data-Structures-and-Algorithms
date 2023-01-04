class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int num : tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.containsValue(1)) return -1;
        int answer=0;
        for(int level : map.values()){
           if(level==1) return -1;
            if(level%3==0){
                answer+=level/3;
            }
            else{
                answer+=level/3+1;
            }
        }
        return answer;
    }
}