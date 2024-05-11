class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] res = new int[ n-k+1];
        int j=0;
        ArrayDeque<Integer> dq = new  ArrayDeque<>();

        for(int i=0;i<k;i++){

            while(!dq.isEmpty() && nums[dq.peekFirst()]<=nums[i] ){
                dq.removeFirst();
            }
            dq.addFirst(i);
        }

        for(int i=k;i<n;i++){

            res[i-k] =  nums[dq.peekLast()];

            if( dq.peekLast() ==i-k ){
                  dq.removeLast();  
            }

            while(!dq.isEmpty() && nums[dq.peekFirst()]<=nums[i] ){
                dq.removeFirst();
            }
            dq.addFirst(i);

        }
        res[n-k] =  nums[dq.peekLast()];

        return res;
        
    }
}