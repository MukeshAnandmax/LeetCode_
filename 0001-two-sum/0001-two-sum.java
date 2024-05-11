class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            if (hm.containsKey(diff)) {

                res[0] = hm.get(diff);
                res[1] = i;
                break;

            }
            hm.put(nums[i], i);
        }

        return res;
    }
}