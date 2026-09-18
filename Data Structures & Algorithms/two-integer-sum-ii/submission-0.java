class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[]{l+1, r+1};
            } else if (sum > target) {
                while (r > l && numbers[r] == numbers[r - 1]) {
                    r--;
                }
                r--;
            } else {
                while (l < r && numbers[l] == numbers[l + 1]) {
                    l++;
                }
                l++;
            }
        }
        return new int[]{-1, -1};
    }
}
