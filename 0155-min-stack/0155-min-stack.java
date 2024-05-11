class MinStack {

    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> minStack;

    public MinStack() {

        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        
    }
    
    public void push(int x) {

         if(stack.isEmpty()){
            minStack.push(x);
             stack.push(x);
        }else{
             stack.push(x);

             if(minStack.peek()>=x){
                 minStack.push(x);
             }
           
        }
        
    }
    
    public void pop() {

         
        if(!stack.isEmpty()){  
            int top = stack.pop();
            if(!minStack.isEmpty()){

                if(top == minStack.peek()){
                    minStack.pop();
                }

            }

        }
        
    }
    
    public int top() {

        
        if(stack.isEmpty()){
            return -1;
        }

        return stack.peek();
        
    }
    
    public int getMin() {

        
        if(minStack.isEmpty()){
            return -1;
        }

        return minStack.peek();
        
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