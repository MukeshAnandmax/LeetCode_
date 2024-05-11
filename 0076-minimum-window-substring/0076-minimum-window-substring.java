class Solution {
    public String minWindow(String A, String B) {



        
        if(B.length()>A.length()){
            return "";
        }
        int left =0;
        int right =0;
        HashSet<Character> hs = new HashSet<>();

        for(int i=0;i<B.length();i++){
           hs.add(B.charAt(i));
        }

        int[] freqA = new int[256];
        int[] freqB = new int[256];

        for(int i=0;i<B.length();i++){

            freqB[B.charAt(i)]++;

        }
        int minLength =Integer.MAX_VALUE;
        int length=0;
        int i=-1;
        int j=-1;

        while( left < A.length() && right < A.length()){

            char c = A.charAt(right);

            if(hs.contains(c)){

                freqA[c]++;
                if(freqMatch(freqA,freqB)){

                    while(freqMatch(freqA,freqB)){

                        char c1 = A.charAt(left);
                        if(hs.contains(c1)){
                           freqA[c1]--;
                        }
                        left++;
                    }

                    length = right-left+2;
                   // System.out.print("["+left+" "+right+" "+length+"]");
                    
                    if(length<minLength){
                        minLength = length;
                        i=left-1;
                        j=right;
                    }

                }  
                //System.out.print(Arrays.toString(freqB));
            }
            right++;
        }

       // System.out.print(i+" "+ minLength);

        if(i==-1 && j==-1){
            return "";
        }

        //return "";
       return A.substring(i,i+minLength);
        
    }

      boolean freqMatch(int[] A, int[] B){

        for(int i=0;i<A.length;i++){

                if(A[i]<B[i]){
                    return false;
                }


        }


        return true;

    }
}