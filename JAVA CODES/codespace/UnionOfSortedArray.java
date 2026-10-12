class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                 } i++;

            }
            else if(nums2[j]<nums1[i]){
                if(list.size()==0 || list.get(list.size()-1)!=nums2[j]){
                    list.add(nums2[j]);
                }j++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }i++;
                    j++;
                }
            }
            
        
        while(i<nums1.length){
            if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);}
              i++;
            
        }
        while(j<nums2.length){
            if(list.size()==0 || list.get(list.size()-1)!=nums2[j]){
                list.add(nums2[j]);
            }
                j++;
            
        }
        int [] arr=new int[list.size()];
        for(int a=0;a<list.size();a++){
            arr[a]=list.get(a);

        }
        return arr;
        
    }
}
