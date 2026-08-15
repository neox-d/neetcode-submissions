class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i=0; i<m; i++) {
            freq1[(int)s.charAt(i) - 97]++;
            freq2[(int)t.charAt(i) - 97]++;
        }

        for (int i=0; i<26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
