class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int A= numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[A];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<A;i++){
            ArrayList<Integer> list = new ArrayList<>();
            adj.add(list);
        }
       
       for(int[] i:prerequisites ){
           int x = i[0];
           int y= i[1];
           adj.get(x).add(y);
           inDegree[y]++;
       }

        //System.out.print(adj);
       
        for(int i=0;i<A;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int x = q.poll();
            for(int i:adj.get(x)){
                inDegree[i]--;
                if(inDegree[i]==0){
                    q.add(i);
                }
            }
        }


        for(int i=0;i<A;i++){
            if(inDegree[i]!=0){
                return false;
            }
        }

        return true;
    }
}