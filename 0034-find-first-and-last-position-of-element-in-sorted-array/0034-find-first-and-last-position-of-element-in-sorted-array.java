class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = binarySearch(nums,target);
        result[1] = binarySearch2(nums,target);


        return result;
    }






        public static int binarySearch(int nums[],int target){
            int start = 0;
            int end = nums.length - 1;
            int ans = -1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(nums[mid] == target){
                    ans = mid;
                    end = end -1;;
                }
                else if (nums[mid] < target){
                    start = mid + 1 ;
                }
                else{
                    end = mid -1;
                }
            }
            return ans;
        }
      

        public static int binarySearch2(int nums[],int target){
            int start = 0;
            int end = nums.length - 1;
            int ans = -1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(nums[mid] == target){
                    ans = mid;
                    start = mid +1;
                }
                else if (nums[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            return ans;
        }
    
}