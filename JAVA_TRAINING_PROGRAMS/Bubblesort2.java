import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort2 {
    public static void main(String args[]) {

    try(Scanner m= new Scanner(System.in)) {

    System.out.print("ENTER SIZE OF ARRAY :");
    int n= m.nextInt();
    int arr[]=new int[n];

    System.out.println("Enter"+n+"Values to be sorted");
     for(int i=0;i<n;i++)
     {
        arr[i]= m.nextInt();
     }
     int temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
 System.out.println("SORTED ARRAY :"+Arrays.toString(arr));
 m.close();
    }
}}