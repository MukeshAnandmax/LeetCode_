class Solution {
    public String removeDuplicates(String A) {


               
        char[] charArray = A.toCharArray();
        ArrayDeque<Character> stack =  new ArrayDeque<>();
 
        for(int i= charArray.length-1;i>=0;i--){
	
	        if(stack.isEmpty()){
		        stack.push(charArray[i]);
	        }else if( stack.peek()==charArray[i] ){
		        stack.pop();
	        }else{
	            stack.push(charArray[i]);
	
	        }
        }
 
        char[] res= new char[stack.size()];
        int k=0;
        while(!stack.isEmpty()){
            res[k++]=stack.pop();
        }
 
        return new String(res);
        
    }
}