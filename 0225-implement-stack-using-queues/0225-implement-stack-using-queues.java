class MyStack {


    Queue<Integer> q1,q2;
   
    public MyStack() {
         q1 = new LinkedList<Integer>();
         q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        
 
	    q2.add(x);
	    while(!q1.isEmpty()){
	        q2.add(q1.remove());
	    }
	     while(!q2.isEmpty()){
	        q1.add(q2.remove());
	    }


    }
    
    public int pop() {
        

        return !q1.isEmpty()?q1.remove():-1;

    }
    
    public int top() {
        return !q1.isEmpty()?q1.peek():-1;
    }
    
    public boolean empty() {
         return q1.isEmpty();
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