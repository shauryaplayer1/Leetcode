class Solution {
    public static void main (String[] args){
        int[] arr = {2,7,11,15,10};
        int target = 9;
        int[] ans = twoSum( arr,target);
        System.out.print(ans[0] + ans[1]);
    }
    public static int[] twoSum(int[] arr, int target) {
        for(int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
            if(target == arr[i] + arr[j]){
                return new int[] { i, j };
            }
          }
        }

         return  new int[] {};
        
    }
}