class Solution {
    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for(int i=0;i<s.length() ; i++){
        
            char ch = s.charAt(i);
            if( (ch=='(') || (ch=='{')||(ch=='[')){
                stack.push(ch);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }
                else if( matching( stack.peek(),ch  ) == false){
                    return false;
                }
                else{
                    stack.pop();
                }


            }

        }

    return stack.isEmpty();
        
    }


    public static boolean matching( char a, char b){

    return ( (  a=='('&& b==')'   )||(  a=='{'&& b=='}'   )||(  a=='['&& b==']'   ));

    }
}