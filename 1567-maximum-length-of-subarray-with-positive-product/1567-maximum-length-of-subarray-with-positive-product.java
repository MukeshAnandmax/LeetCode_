class Solution {
    public int getMaxLen(int[] nums) {

        int n = nums.length;

        int[]  positiveLengthEnding = new int[n];
        int[]  negativeLengthEnding = new int[n];

        positiveLengthEnding[0] = 0;
        negativeLengthEnding[0] = 0;
        int maxLen = 0;

        if (nums[0] > 0) {
            positiveLengthEnding[0] = 1;
            maxLen = 1;
        } else if (nums[0] < 0) {
            negativeLengthEnding[0] = 1;
        }

        
        for (int i = 1; i < n; i++) {
            if(nums[i] > 0) {
                positiveLengthEnding[i] = positiveLengthEnding[i-1] +1;
                
                if(negativeLengthEnding[i-1]>0){
                    negativeLengthEnding[i] = negativeLengthEnding[i-1]+1;
                }else {
                    negativeLengthEnding[i] = 0;
                }
            }else if(nums[i] < 0) {
                if(positiveLengthEnding[i-1]>0){
                    negativeLengthEnding[i] = positiveLengthEnding[i-1]+1;
                }else {
                    negativeLengthEnding[i] = 1;
                }
                
                if(negativeLengthEnding[i-1]>0){
                    positiveLengthEnding[i] = negativeLengthEnding[i-1]+1;
                }else{
                    positiveLengthEnding[i] = 0;
                }
                
            }else {
                positiveLengthEnding[i] = 0;
                negativeLengthEnding[i] = 0;
            }
            maxLen = Math.max(maxLen, positiveLengthEnding[i]);
        }
        return maxLen;
    }
}