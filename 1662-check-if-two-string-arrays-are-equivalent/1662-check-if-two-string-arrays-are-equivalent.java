class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r = String.join("",word1);
        String r1=String.join("",word2);

        return r.equals(r1);
       
    }
}