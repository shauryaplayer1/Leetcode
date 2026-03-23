class Solution {
    public boolean rotateString(String s, String goal) {
        
        StringBuilder sb = new StringBuilder(s);
        int i =0;
        while(i<s.length()){
            if(sb.toString().equals(goal)){
                return true;
            }
            else{
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
                i++;
                
            }
        }
        return false;

    }
}