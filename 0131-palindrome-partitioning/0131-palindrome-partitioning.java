class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        palindromePartition(s,0,res,new ArrayList<>());
        return res;
    }

        public void palindromePartition(String s, int start, List<List<String>> palindromes, List<String> tempResult){

        if(start==s.length()){
            palindromes.add(new ArrayList<>(tempResult));
            return;
        }
        for(int i=start; i<s.length(); i++){
            if(isPalindrome(s,start,i)){
                tempResult.add(s.substring(start,i+1));
                palindromePartition(s,i+1,palindromes,tempResult);
                tempResult.remove(tempResult.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        if(start>end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
}