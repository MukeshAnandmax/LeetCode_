class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int start =0;

        for(int i: gain){
            start = i+start;
            max = Math.max(start,max);
        }

        return max;
        
    }
}