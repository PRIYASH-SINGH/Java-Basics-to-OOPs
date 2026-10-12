class Solution {
    public int secondLargestElement(int[] nums) {
        int i=0;
        int max=nums[0];
        int smax=Integer.MIN_VALUE;
        while(i<=nums.length-1)
        {
            if(nums[i]>max)
            {
                smax=max;
                max=nums[i];
            }
          else if(nums[i]<max && nums[i]>smax)
        {
            smax=nums[i]; 
        }
             i++;
        }
        if(smax !=Integer.MIN_VALUE){
        return smax;
         }
        return -1;
    }
}