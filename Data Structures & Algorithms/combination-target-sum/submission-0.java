class Solution {

    public void backtrack(int target, List<Integer> curr, int i, int n, int[] nums, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || i >= n) return;

        curr.add(nums[i]);
        backtrack(target - nums[i], curr, i, n, nums, ans);
        curr.remove(curr.size() - 1);
        backtrack(target, curr, i + 1, n, nums, ans);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        backtrack(target, new ArrayList<>(), 0, n, nums, ans);

        return ans;
    }
}
