class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> list=new ArrayList<>();
        for(String st : words) {
            set.add(st);
            }
        for(String word:words){
            if(isConCat(word,set)){
                list.add(word);
            }
               
        }
        return list;
    }
    boolean isConCat(String word,Set<String> set){
        int len=word.length();
        for( int i=1;i<len;i++){
            String prefix=word.substring(0,i);
            String suffix=word.substring(i,len);
            if(set.contains(prefix) && (set.contains(suffix) || isConCat(suffix,set))){
                return true;
        }
    }
        return false; 
}
}