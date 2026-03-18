class Solution {
    public String removeDuplicates(String s) {
        StringBuilder st = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = st.length();
            
            if (len > 0 && st.charAt(len - 1) == c) {
                st.deleteCharAt(len - 1); // pop
            } else {
                st.append(c); // push
            }
        }
        
        return st.toString();
    }
}