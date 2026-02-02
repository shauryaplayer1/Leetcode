class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int start =0;
        for(int i =0;i<=ch.length;i++){
            if(i == ch.length || ch[i] == ' '){
                reverse(ch,start,i-1);
                start = i+1;
            }
        }
        return new String(ch);
        
        
    }
    private void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }
}