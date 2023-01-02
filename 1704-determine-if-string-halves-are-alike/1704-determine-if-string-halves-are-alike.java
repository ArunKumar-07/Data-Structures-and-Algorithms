class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int first =0;
        int middle=s.length()/2;
        for( int i=0;i<middle;i++){
            char ch = s.charAt(i);
            char ch2=s.charAt(middle+i);
            if(set.contains(ch)) first++;
            if(set.contains(ch2)) first--;
        }
         return first == 0 ;
    }
}