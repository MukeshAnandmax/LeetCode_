class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        Arrays.sort(candidates);

        combinationSum22(candidates, target, result,  combinations, 0);

        return combinations;

        
    }

    public static void combinationSum22(int[] sortedA, int remainingTarget, List<Integer> result, List<List<Integer>> combinations, int currIdx){

        if(remainingTarget==0){
            combinations.add(new ArrayList<>(result));
            return;
        }

        for(int i=currIdx; i<sortedA.length; i++){

            if(i>currIdx && sortedA[i]==sortedA[i-1]  ){
               continue;
            }

            if(remainingTarget<sortedA[i]){
                break;
            }

            result.add(sortedA[i]);
            combinationSum22(sortedA,remainingTarget-sortedA[i],result,combinations,i+1);
            result.remove(result.size()-1);

        }
    }

}