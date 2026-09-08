import java.util.*;

public class InsertionSort {
    static void Insertion(int[] arr,int n){
        for(int j=1;j<n;j++){
            int key=arr[j];
            int i=j-1;
        while(i>=0 && arr[i]>key){
             arr[i+1]=arr[i];
             i=i-1;
        }
        arr[i+1]=key;
    }
 }
 public static void main(String args[]){
     try(Scanner scan=new Scanner(System.in)){
        System.out.print("Enter Size of Array >>>");
        int n=scan.nextInt();
        int arr[]=new int[n];
        
        System.out.print("Enter Elements of array >>>\n");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Before Sort >>> ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        Insertion(arr,n);
        System.out.print("\nAfter Sort >>> ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
 }
}