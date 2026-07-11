import java.util.*;

public class NumberFilters {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome !!! To Number Filter Program");
        System.out.print( "Enter Size of the array\n>>> ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        int even_arr[] = new int[n];
        int j=0;
        int k=0;
        int odd_arr[]=new int[n];
        int max=arr[0];
        for(int i=0;i<=n-1;i++){
            System.out.print("ENTER VALUE AT INDEX "+i+" OF ARR >>> ");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            if(arr[i]%2==0)
            {     
            even_arr[j]=arr[i];//at index 0 we can save first even value of arr
            j++;//increase 0 index to 1
            }
            else
            {   
                odd_arr[k]=arr[i];
                k++; 
           }
     
    }
    System.out.print("EVEN SUBARRAY OF ARRAY "+Arrays.toString(arr)+" IS THIS ARRAY >>> [ ");
    for(int i=0;i<even_arr.length;i++){
      System.out.print(even_arr[i]+" ");
    }
    System.out.println("]\n");
     System.out.print("ODD SUBARRAY OF ARRAY "+Arrays.toString(arr)+" IS THIS ARRAY >>> [ ");
    for(int i=0;i<odd_arr.length;i++){
      System.out.print(odd_arr[i]+" ");
    }
    System.out.println("]\n");
    for(int i=1;i<n;i++)
    {
        if(max<arr[i])
        {
         max=arr[i];
        }   
    }
    System.out.println("MAXIMUM ELEMENT OF THE ARRAY IS >>> "+max);
}
} 