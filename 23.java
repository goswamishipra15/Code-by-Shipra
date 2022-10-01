class MyStack {
    Queue<Integer> stack;
    public MyStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        int size = stack.size();
        while(size > 1){
            stack.add(stack.remove());
            size--; 
        }
        
    }
    
    public int pop() {
        return stack.remove();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
