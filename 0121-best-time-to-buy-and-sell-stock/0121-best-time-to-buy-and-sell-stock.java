class Solution {
    public int maxProfit(int[] prices) {
        
        int minTN =Integer.MAX_VALUE;
        int profit =0;
        
        for(int i=0;i<prices.length;i++){
            minTN= Math.min(minTN,prices[i]);
            profit =Math.max(profit, prices[i]-minTN);
        }

        return profit;
        
    }
}