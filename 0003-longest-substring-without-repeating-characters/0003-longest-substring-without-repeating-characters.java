class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans  =0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    count++;
                }else{
                    
                    break;
                }
            }
            ans = Math.max(ans,set.size());
            count=0;
            
        }
        return Math.max(ans, count);
    }
}