import java.util.*;

public class SelectionSort {
    public static void mian(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
         arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
