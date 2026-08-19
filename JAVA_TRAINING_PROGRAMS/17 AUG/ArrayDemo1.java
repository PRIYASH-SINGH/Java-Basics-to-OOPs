class ArrayDemo1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        for(int i=0;i<arr.length;i++){
            int revproduct=1;
            for(int rev=i-1;rev>=0;rev--){
               revproduct*=arr[rev];
            }
        System.out.println("REV "+revproduct+" ");
         int fwdproduct=1;
         for(int fwd=i+1;fwd<arr.length;fwd++){
            fwdproduct*=arr[fwd];
         }
         System.out.println("FWD "+fwdproduct+" ");
        System.out.println("Except Self "+revproduct*fwdproduct+" ");
}        
}
}