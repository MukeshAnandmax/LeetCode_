class Solution {
    public int maximumSum(int[] arr) {
        
        int n = arr.length;
        int[] withDeletion = new int[n];
        int[] withoutDeletion = new int[n];
        
        withDeletion[0] =(Integer.MIN_VALUE)/2;
        withoutDeletion[0] =  arr[0];
        
        int maxSum = (Integer.MIN_VALUE)/2;
        
        for (int i=1;i<n;i++) {
            withoutDeletion[i] = Math.max(withoutDeletion[i-1]+arr[i],arr[i]);

            withDeletion[i] = Math.max(withDeletion[i-1]+arr[i], withoutDeletion[i-1]);
             
            maxSum = Math.max(maxSum,Math.max(withDeletion[i],withoutDeletion[i]));
        }

        maxSum = Math.max(maxSum,Math.max(withDeletion[n-1],withoutDeletion[n-1]));
        
        return maxSum;
    }
}