class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();

        if (n == 0) return 0;
        
        int l = 0;
        int r = 1;
        int ans = 1;

        HashSet<Character> st = new HashSet<>();
        st.add(s.charAt(l));
        while (l < r && r < n) {

            if (!st.contains(s.charAt(r))) {
                st.add(s.charAt(r));
            } else {
                while (s.charAt(l) != s.charAt(r)) {
                    st.remove(s.charAt(l));
                    l++;
                }
                // st.remove(s.charAt(l));
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
