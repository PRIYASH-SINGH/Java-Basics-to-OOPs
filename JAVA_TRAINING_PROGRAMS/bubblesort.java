import java.util.Arrays;

public class bubblesort{
public static void main(String args[])
{
    
    int arr[]={10,20,6,4,3,8,9,21,7,8};
    int temp ;
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=0;j<arr.length-i-1;j++){

        
        if(arr[j]>arr[j+1])
        {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
System.out.println(Arrays.toString(arr));}
}
