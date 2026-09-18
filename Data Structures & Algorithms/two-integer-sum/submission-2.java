class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int N = nums.length;

        for (int i=0; i<N; i++) {
            int num = target - nums[i];
            if (mp.containsKey(num)) {
                return new int[]{mp.get(num), i};
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
