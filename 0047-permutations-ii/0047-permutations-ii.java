class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        findPermutation2(nums,new boolean[nums.length],new ArrayList<>(),res);
        return res;
        
    }

     public  void findPermutation2(int[] A, boolean[] visited, List<Integer> result, List<List<Integer>> permutations){

        if(result.size()==A.length){
            permutations.add(new ArrayList<>(result));
            return;
        }

        for(int i=0; i<A.length; i++) {


            if (visited[i]) {
                continue;
            }

            if(i>0 && A[i]==A[i-1] && !visited[i-1]){
                continue;
            }

            visited[i] = true;
            result.add(A[i]);
            findPermutation2(A, visited, result, permutations);
            visited[i] = false;
            result.remove(result.size() - 1);
        }

    }
}