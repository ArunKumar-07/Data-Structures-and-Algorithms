class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0;
      int j =0;
      int ans =0;
        HashSet<Character> set = new HashSet<>();
    while( i< s.length()  && j< s.length()){
        if(!set.contains(s.charAt(j))){
            //if conditon
            set.add(s.charAt(j));
            j++;
            ans = Math.max(ans, j - i);
        }else{
            set.remove(s.charAt(i));
            i++;
        }
    }
        return ans;
    }
}