class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int i = 0;
        double median  = 0;
        for(int num : nums1){
            ans[i] = num; 
            i++;

         
        }
        for(int num : nums2){
            ans[i] = num;
            i++;
        }
        Arrays.sort(ans);

        if(ans.length %2 == 0){
            median = (ans[ans.length/2]+ans[(ans.length/2)-1])/2.0;
        }
        else{
            median = ans[(ans.length)/2];
        }
        
        return median;
    }
    
}