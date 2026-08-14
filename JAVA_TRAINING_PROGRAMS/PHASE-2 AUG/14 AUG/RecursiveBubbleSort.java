import java.util.*;

public class RecursiveBubbleSort{
    static int Sort(int[] a, int i){
        if(i==0){
            return 0;
        }
        for(int j=0;j<i;j++){
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;    
        }
    }
        return Sort(a,i-1);
}
    public static void main(String[] args) {
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
        Sort(arr,n-1);
        System.out.print("\nAfter Sort >>> ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
}
