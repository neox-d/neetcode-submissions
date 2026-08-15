class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while (true) {
            int sum = 0;
            set.add(n);
            while (n != 0) {
                sum += (n % 10)*(n % 10);
                // System.out.println(sum);
                n = n / 10;
            }
            if (sum == 1) return true;

            if (set.contains(sum)) {
                return false;
            }

            n = sum;
        }
    }
}
