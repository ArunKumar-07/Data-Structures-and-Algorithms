class Solution {
    public int minSwaps(String s) {
        Stack<Character> st= new Stack<>();
        int imBalanced =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }else{
                 if(!st.isEmpty()){
                     st.pop();
                 }else{
                     imBalanced++;
                 }
            }
        }
        return (imBalanced+1)/2;
    }
}