class Solution {
    public void generateSubsets(int[] nums, int i, List<Integer> arr, List<List<Integer>> ans) {
        if (i >= nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        arr.add(nums[i]);
        generateSubsets(nums, i + 1, arr, ans);
        arr.remove(arr.size() - 1);
        generateSubsets(nums, i + 1, arr, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        generateSubsets(nums, 0, arr, ans);
        return ans;
    }
}
