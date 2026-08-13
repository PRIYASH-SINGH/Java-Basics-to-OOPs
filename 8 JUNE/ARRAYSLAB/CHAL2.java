// finding odd even numbers in an array
public class CHAL2 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Even numbers:"+even_count);
        System.out.println("Odd numbers:"+odd_count);
    }
}
