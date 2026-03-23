class Solution {
    public int countElements(int[] A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = A.length;
        int count =0;


        for (int i : A) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        for (int i : A) {
            if(i>min && i<max){
                count++;
            }
        }

        return count;
        
    }
}