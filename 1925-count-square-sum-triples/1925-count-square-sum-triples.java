class Solution {
    public int countTriples(int n) {
        int res=0;

        HashSet<Integer> hs = new HashSet<>();
         for(int i=1;i<=n;i++){
             hs.add(i*i);
         }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x = i*i+j*j;

               if(hs.contains(x) ){
                    res++;
                }

            }

        }
        return res;
    }
}