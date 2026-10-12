class Solution {
    public void rotateArrayByOne(int[] nums) {
         
          int i=1;
          int temp=nums[0];
        while(i<=nums.length-1){
            nums[i-1]=nums[i];  
            i++;

        }
        
        nums[nums.length-1]=temp;
    }
}