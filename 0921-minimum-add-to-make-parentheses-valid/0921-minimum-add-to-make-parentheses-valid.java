class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int close =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    close++;
                }else{
                    st.pop();
                }
            }
        }
        return Math.abs(st.size() + close);
    }
}