class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm =  new HashMap<>();
        int currentSum =0;
        int count =0;
        hm.put(0,1);
        
        for(int i=0,n= nums.length;i<n;i++){
            
            currentSum+=nums[i];
            
            if(hm.containsKey(currentSum-k)){
                count+=hm.get(currentSum-k);
            }
            hm.put(currentSum,hm.getOrDefault(currentSum,0)+1);
        }
        
        return count;
    }
}