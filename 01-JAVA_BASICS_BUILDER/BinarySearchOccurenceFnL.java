package JAVA_TRAINING_PROGRAMS.CodingBLock;

public class BinarySearchOccurenceFnL {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,6,7,8,9,10};
        int target=1;

        int firstOccurence=findFirstOccurence(arr,target);
        int lastOccurence=findLastOccurence(arr,target);

        System.out.println("First occurence: "+firstOccurence);
        System.out.println("Last occurence: "+lastOccurence);
        
    }
    static int findFirstOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    static int findLastOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
