class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m != n) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i=0; i<m; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }

        for (int i=0; i<26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
