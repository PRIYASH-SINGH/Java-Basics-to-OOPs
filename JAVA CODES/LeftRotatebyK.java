

public class LeftRotatebyK {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int[] temp= new int[k];

        for(int j=0;j<k;j++)
        {
         temp[j]=arr[j];
        }
        for(int i=k;i<arr.length;i++)
        {
            arr[i-k]=arr[i];
        }
        for(int i=arr.length-k;i<arr.length;i++)
        {
            arr[i]=temp[i-(arr.length-k)];
        }

    }
    
}
