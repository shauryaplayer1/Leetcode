class Solution {
    public int maxScore(int[] cP, int k) {
        int rs =0;
        int ri = cP.length -1;
        int max = 0;
        int ls = 0;

        for(int i =0;i<k;i++){
            ls+= cP[i];
            max = ls;
        }
        for(int j = k-1;j>=0;j--){
            ls -= cP[j];
            rs += cP[ri];
            ri -= 1;
            max = Math.max(max,ls+rs);
        }
        return max;
       
    }
}