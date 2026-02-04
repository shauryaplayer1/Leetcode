class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        int n = nums.length;

        if(nums.length == 0) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for(int i=n-1; i>=0; i--) {
            if(nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}