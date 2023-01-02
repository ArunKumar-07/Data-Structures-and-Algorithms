class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        int a,b;
        for(String s1 : tokens){
           if(s1.equals("+")) st.push(st.pop()+st.pop());
           else if(s1.equals("*")) st.push(st.pop()*st.pop());
           else if(s1.equals("-")){
               a=st.pop();
               b=st.pop();
               st.push(b-a);
           }
           else if(s1.equals("/")){
                a=st.pop();
               b=st.pop();
               st.push(b/a);
           }
            else {
                st.push(Integer.parseInt(s1));
            }
        }
        return st.pop();
    }
}