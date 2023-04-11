class Solution {
    public String removeStars(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for( int i=0;i<ch.length;i++){
            if('*'!=ch[i]){
                st.push(ch[i]);
            }
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}