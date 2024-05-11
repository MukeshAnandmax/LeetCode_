class Solution {
    public String simplifyPath(String path) {

        ArrayDeque<String> stack = new  ArrayDeque<String>();
        String[] arrOfStr = path.split("/");
        System.out.print(Arrays.toString(arrOfStr));

        boolean prevPeriod =false;

        for(int i=0;i<arrOfStr.length;i++){

            if(!stack.isEmpty() && arrOfStr[i].equals("..")){
                stack.pop();
            }
            else if(!arrOfStr[i].equals("") && !arrOfStr[i].equals(".")&&!arrOfStr[i].equals("..")){
                stack.push(arrOfStr[i]);
            }
        }

        String res="";

        while(!stack.isEmpty()){

            System.out.print(stack.peek()+" ");
            String temp = stack.pop();
            if(temp.length()!=0){
                res ="/"+ temp + res;
            }
           
        }


        if(res.length()==0){
            return "/";
        }
        return res;
        
    }
}