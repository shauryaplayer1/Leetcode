class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            for(int j =0;j<nums.length;j++){
                if(max == nums[j]){
                    index = j;

                }
            }
        }
     return index;   
    }
}