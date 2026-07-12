class Solution {
    public int rob(int[] house) {

         int n = house.length;

         if(n==1){
            return house[0];
         }
        return Math.max(houseRobberyTabu3(house, 0, n - 1), houseRobberyTabu3(house, 1, n));
        
    }

     int houseRobberyTabu3(int[] house,int start,int end) {


        int prev = house[start];
        int prev2 = 0;

        for(int i = start+1; i < end; i++){

            int pick =  house[i];
            int notPick =Integer.MIN_VALUE;

            if(i - 2 >= start) {
                pick = prev2 + pick;
            }

            notPick =prev ;
            prev2 = prev;
            prev = Math.max(pick, notPick);
        }

        return prev;
    }
}