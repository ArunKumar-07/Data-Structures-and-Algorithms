class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==1) return 1;
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int ans =0;
        while(i < s.length() &&  j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }else{
                ans = Math.max(ans , set.size());
                set.remove(s.charAt(i));
                i++;
            }
        }
        return Math.max(ans,set.size());
    }
}