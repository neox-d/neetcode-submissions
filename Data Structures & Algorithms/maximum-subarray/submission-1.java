class Solution {
    public int maxSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;
        int curr = 0;

        for (int num: nums) {
            curr += num;
            sum = Math.max(sum, curr);
            if (curr < 0) {
                curr = 0;
            }
        }

        return sum;
    }
}
