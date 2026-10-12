class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int u=1;
        while(i<nums.length){
                if(nums[i]!=nums[i-1])
                {
                    nums[u]=nums[i];
                    u++;
                    
                }
            i++;
        }
        return u;
        
    }
}