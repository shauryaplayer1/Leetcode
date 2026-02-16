class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int n = s.length();
        int r=0;
        int l=0;
        int max = 0;
        while(r<n){
            char c = s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                max = Math.max(max,r - l + 1);
                r++;

            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return max;

        }
        
    }
