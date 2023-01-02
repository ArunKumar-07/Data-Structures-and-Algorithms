class Solution {
    public String reverseWords(String s) {
        
        String[] word = s.split("\\s+");
        StringBuilder str = new StringBuilder();
        for( int i=word.length-1;i>=0;i--){
            str.append(word[i]+" ");
        }
        return str.toString().trim();
    }
}