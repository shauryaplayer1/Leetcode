class Solution {
    public String restoreString(String s, int[] ind) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < ind.length; i++) {
            sb.setCharAt(ind[i], s.charAt(i));
        }

        return sb.toString();
    }
}

