class Solution {
    public int findKthLargest(int[] A, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }

        for(int i=0;i<k-1;i++){
            pq.poll();
        }

        return pq.poll();
    }
}