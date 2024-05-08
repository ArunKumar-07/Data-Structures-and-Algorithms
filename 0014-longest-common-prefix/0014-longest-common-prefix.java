class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length-1];
        int prefix = 0 ;
        while(prefix <= first.length()-1 && prefix <= second.length()-1){
            if(first.charAt(prefix) == second.charAt(prefix)){
                prefix++;
            }else{
                break;
            }
        }
        return first.substring(0,prefix);
    }
}