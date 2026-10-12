class Solution {
    public void moveZeroes(int[] nums) {
        int zeroptr=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroptr=i;
                break;
            }
       
        }
         if(zeroptr==-1){
            return;
        }
        for(int j=zeroptr+1;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[zeroptr];
                nums[zeroptr]=temp;
                zeroptr++;
            }
        }
        
        
    }
}