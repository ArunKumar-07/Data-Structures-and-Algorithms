class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
         s1.add(x);
    }
    
    public int pop() {
        addElement(s1,s2);
        int ans = s2.pop();
        addElement(s2,s1);
        return ans;
    }
    
    public int peek() {
        addElement(s1,s2);
        int no=s2.peek();
        addElement(s2,s1);
         return no;
    }
    public void addElement(Stack<Integer> s1 , Stack<Integer> s2){
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */