class Solution {
    public int linearSearch(int nums[], int target) {
		int i=0;
        while(i<nums.length){
            if(nums[i]==target){
                return i;
            }
            i++;
        }
    return -1;
    }
}