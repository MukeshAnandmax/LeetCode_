class Solution {
    public String reverseWords(String s) {

        String s1 =  s.trim().replaceAll(" +"," ");
        System.out.println(s1);
        String[] splited =  s1.split(" ");
        System.out.print(Arrays.toString(splited));
      
        String res="";
        for(int i= splited.length-1;i>=0;i--){
            String str = splited[i];
            res = res+" "+str;
        }
        return res.trim();
    }
}