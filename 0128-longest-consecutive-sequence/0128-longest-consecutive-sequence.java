class Solution {
    public int longestConsecutive(int[] A) {



         HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        int max =0;
        for(int i=0;i<A.length;i++){

            int count =0;

            if(!hs.contains(A[i]-1)){

                int j=A[i];

                while(  hs.contains(j)){
                    j++;
                    count++;

                }

            }

            max = Math.max(count,max);
        }
        return max;
        
    }
}