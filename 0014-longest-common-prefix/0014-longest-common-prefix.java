class Solution {
    public String longestCommonPrefix(String[] strs) {
      String prefix=strs[0];
        for( int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}