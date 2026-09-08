public class MaxTrapwater {
    public static void main(String args[]){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
       /*  int trap=0;
        for(int i=0;i<arr.length;i++){
            int lmax=arr[i];
            for(int j=i-1;j>=0;j--){
                lmax=Math.max(lmax,arr[j]);
            }
            int rmax=arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            int Water=Math.min(lmax,rmax)-arr[i];
            System.out.print(Water+" ");
            trap+=Water;
        }
        System.out.println("Total MAX WATER "+trap);
        } */

        //OPtimized Solution
       int left[]=new int[arr.length];//created a left array
       left[0]=arr[0];//initialze it from start
       for(int i=1;i<arr.length;i++){
        left[i]=Math.max(left[i-1],arr[i]);//stores max height of left side
       }
       int right[]=new int[arr.length];
       right[right.length-1]=arr[arr.length-1];//stores max height of right side
       for(int i=arr.length-2;i>=0;i--){
        right[i]=Math.max(right[i+1],arr[i]);//stores max height of right side
       }
       int trapwater=0;
       for(int i=0;i<arr.length;i++){
        trapwater+=Math.min(left[i],right[i])-arr[i];
       }
       System.out.println("Total MAX WATER "+trapwater); 

    }
}
