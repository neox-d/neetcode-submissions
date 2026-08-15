class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (!st.isEmpty()) {
                if (s.charAt(i) == ')' && st.peek() != '(') {
                    return false;
                }

                if (s.charAt(i) == '}' && st.peek() != '{') {
                    return false;
                }

                if (s.charAt(i) == ']' && st.peek() != '[') {
                    return false;
                }

                st.pop();
            } else {
                return false;
            }
        }

        if (!st.isEmpty()) {
            return false;
        }

        return true;
    }
}