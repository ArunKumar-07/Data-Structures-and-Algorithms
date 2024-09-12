class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character> list = new ArrayList<>();
        for(char ch : allowed.toCharArray()){
            list.add(ch);
        }
        int ans =0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            boolean check = true;
            for(char ch : s.toCharArray()){
                if(!list.contains(ch)){
                    check = false;
                    break;
                }
            }
            if(check)  ans++;
        }
        return ans;
    }
}