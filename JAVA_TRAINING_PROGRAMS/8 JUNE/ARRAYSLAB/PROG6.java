import java.util.*;
         
public class PROG6 {
    public static void main (String args[]){
        int arr[]=new int[8];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<8;i++)
            {
            System.out.println("Enter Salary of Emplyoee "+(i+1));
            arr[i]=scan.nextInt(); //Taking input from user
            }
        scan.close(); //Closing scanner
        for(int i=0;i<7;i++) // outer loop for number of passes (n-1=7)
            {
        for(int j=0;j<7-i;j++) // inner loop for comparison and swapping
            {
        if(arr[j]>arr[j+1]) // checks if current element is greater than the next element
            {
            int temp =arr[j]; //swapping the elements
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
     } System.out.println("SORETED EMPLOYEES SALARY IN ASCENDING ORDER:"+Arrays.toString(arr));//printsorted array
  }
}
