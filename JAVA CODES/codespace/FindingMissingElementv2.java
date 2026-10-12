class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int sum=0;
        int n=nums.length;
        while(i<n){
            sum+=nums[i];
            i++;
            }
        int wholesum=(n*(n+1))/2;
        int missing=wholesum-sum;
     return missing;
    }
}