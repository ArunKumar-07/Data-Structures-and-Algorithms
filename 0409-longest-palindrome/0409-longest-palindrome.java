class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int sum =0;
        boolean check = false;
        for(int it : map.values()){
            if(it % 2 ==0){
                sum+=it;
            }else{
                sum+=it-1;
                check = true;
            }
        }
        if(check) sum+=1;
        return sum;
    }
}