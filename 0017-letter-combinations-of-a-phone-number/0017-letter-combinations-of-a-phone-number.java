class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def"); 
        hm.put('4',"ghi"); 
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        StringBuilder temp = new StringBuilder();
        solve(digits,res,temp,0,hm);
        return res;
    }

    public void solve( String digits,List<String> res,StringBuilder sb,int currIndex,HashMap<Character,String> hm ){

        if(sb.length() == digits.length()){
            res.add( new String(sb));
            return;
        }

        for(char c: hm.get(digits.charAt(currIndex)).toCharArray() ){
            sb.append(c);
            solve(digits,res,sb,currIndex+1,hm);
            sb.deleteCharAt( sb.length()-1);
        }
        




    }



}