class Solution {
    public int maxSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;
        int curr = 0;

        for (int num: nums) {
            curr = Math.max(num, curr+num);
            sum = Math.max(sum, curr);
        }

        return sum;
    }
}
