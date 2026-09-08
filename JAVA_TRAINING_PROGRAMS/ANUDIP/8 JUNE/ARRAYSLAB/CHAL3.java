// finding second largest element in the array
public class CHAL3 {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int max1=Integer.MIN_VALUE; // initialises max1 with smallest integer value
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){ // if current element is greater than max1
                max1=arr[i]; // update max1
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]!=max1){ // if current element is greater than max2 and not equal to max1
                max2=arr[i]; // update max2
            }
        }
        System.out.println("Second largest element: "+max2);
    }
}
