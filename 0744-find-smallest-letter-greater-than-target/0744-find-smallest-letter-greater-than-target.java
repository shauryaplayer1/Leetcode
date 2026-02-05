class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        char ch ='a';

        

        for(int i =0;i<letters.length;i++){
            if(letters[(int)i] > (int)target){

                ch = letters[i];
                break;
                
            }
            else{
                ch = letters[0];
            }
        }
        return ch;
    }
}