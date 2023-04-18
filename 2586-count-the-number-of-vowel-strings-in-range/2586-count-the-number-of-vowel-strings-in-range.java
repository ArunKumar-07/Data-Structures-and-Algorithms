class Solution {
    public int vowelStrings(String[] words, int left, int right) {
          int count =0;
    for( int i=left;i<=right;i++){
        String ans = words[i];
        if( (find(ans.charAt(0))  && find(ans.charAt(ans.length()-1))) == true ){
            count ++;
        }
    }
       return count; 
        
    }
      static boolean find(Character ch){
        if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u' ){
            return true;
        }
        return false;
    }
}