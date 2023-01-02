class Solution {
    public String frequencySort(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
        for( char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> qu = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        qu.addAll(map.keySet());
        
        StringBuilder sb=new StringBuilder();
        while(!qu.isEmpty()){
            char c =qu.poll();
            for( int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}