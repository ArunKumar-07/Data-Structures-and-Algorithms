class Solution {
    public boolean wordPattern(String pattern, String s) {
        String s1[] = s.split(" ");
        if(pattern.length()!=s1.length) return false;
        HashMap<Character,String> map  = new HashMap<>();
        for( int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String animal=s1[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(animal)){
                    return false;
                }   
            }
            else{
                if(map.containsValue(animal)) return false;
                map.put(ch,animal);
            }  
        }
        return true;
    }
}