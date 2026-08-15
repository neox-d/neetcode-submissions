class Solution {

    public boolean isAnagram(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if (m != n) return false;

        int[] freq = new int[26];

        for (int i=0; i<m; i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int val: freq) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();

        int n = strs.length;
        boolean[] processed = new boolean[n];
        for (int i=0; i<n; i++) {
            if (processed[i]) {
                continue;
            } else {
                processed[i] = true;
                List<String> str = new ArrayList<>();
                str.add(strs[i]);
                for (int j=i+1; j<n; j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        processed[j] = true;
                        str.add(strs[j]);
                    }
                }
                ans.add(str);
            }
        }

        return ans;
    }
}
