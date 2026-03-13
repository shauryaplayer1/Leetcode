class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        int l =0;
        int r =0;
        int n = nums.length;
        double sum = 0;
        while(r<n){
            sum+= nums[r];



            if(r-l+1 == k){
                max = Math.max(max,sum/k);
                sum-= nums[l];
                l++;
            }
           r++;

        }
        return max;
        
    }
}