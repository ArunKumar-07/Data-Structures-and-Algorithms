class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i) ,map.getOrDefault(s.charAt(i),0)+1);
        }
        int res = 0;
        boolean check = false;
        for(char number :map.keySet()){
            int num = map.get(number);
            if( num %2==0){
                //if condition
                res+=num;
            }else{
                //else
                res+=num-1;
                check =true;
            }
        }
        if(check) res+=1;
        return res;
    }
}