class Solution {
    public List<String> commonChars(String[] words) {
        List<HashMap<Character,Integer>> outer = new ArrayList<>();
        for(String s : words){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            outer.add(map);
        }
        List<String> list = new ArrayList<>();
        for(char letter : outer.get(0).keySet()){
            int res =Integer.MAX_VALUE;
            for(HashMap<Character,Integer> hmap : outer){
                if(hmap.containsKey(letter)){
                    //
                    res=Math.min(res,hmap.get(letter));
                }else{
                    res=0;
                    break;
                }
            }
            for(int i=0;i<res;i++){
                list.add(Character.toString(letter));
            }
        }
        return list;
    }
}