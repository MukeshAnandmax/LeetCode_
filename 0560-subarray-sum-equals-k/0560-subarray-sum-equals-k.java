class Solution {
    public int subarraySum(int[] A, int B) {



         HashMap<Long,Integer> hm = new HashMap<>();
        int count=0;
        long psum[] = new long[A.length];
        psum[0]= A[0];
      
        for(int i=1;i<A.length;i++){

            psum[i] =psum[i-1]+ A[i];
         
        }

       

         for(int i=0;i<A.length;i++){

             if(psum[i] ==B){
                 count++;
             }

            if(hm.containsKey(psum[i]-B)){

                count += hm.get(psum[i]-B);
                
            }
            hm.put(psum[i],hm.getOrDefault(psum[i],0)+1);

         }

        return count ;
        
    }
}