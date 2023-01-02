class Solution {
    class Pair{
        String first;
        int second;
        Pair(String first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        Queue<Pair> qu=new LinkedList<>();
        for( String s  : wordList){
            set.add(s);
        }
        qu.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!qu.isEmpty()){
            String name = qu.peek().first;
            int steps= qu.peek().second;
            qu.remove();
            if(name.equals(endWord)== true) return steps;
            for( int i=0;i<name.length();i++){
           
                for(char ch ='a';ch<='z';ch++){
                   char[] replacedCharArray = name.toCharArray();
                    replacedCharArray[i]=ch;
                    String replaceWord = new String(replacedCharArray);
                    if(set.contains(replaceWord)==true){
                        set.remove(replaceWord);
                        qu.add(new Pair(replaceWord,steps+1));
                    }
                    
                    }
            }
        }
        return 0;
    }
}