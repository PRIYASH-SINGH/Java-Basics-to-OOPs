class Solution {
    public int largestElement(int[] nums) {
        int i=1;
        int max=nums[0]; 
        // so that if a array has 1 element we can access it to be max
        while(i<=nums.length-1)
        //checks i for 1 , 2 , 3 .... till size-1 so no out of bound indexing
        {
            if(nums[i]>max)
            {
            max=nums[i];
            }
            i++;

        }
        return max;
    
    }
}