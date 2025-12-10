class MinStack {
    public int min=Integer.MAX_VALUE;
    public Stack<Integer> stk;
    public PriorityQueue<Integer> pq = new PriorityQueue<>();
    public MinStack() {
        this.stk = new Stack<Integer>();
             
    }
    
    public void push(int val) {
        pq.offer(val);
        stk.push(val);
    }
    
    public void pop() {
        pq.remove(stk.peek());
        stk.pop();        
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        int r= pq.poll();
        pq.offer(r);
        return r;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */