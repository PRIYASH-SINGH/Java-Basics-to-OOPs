public class Activity2{
    public static void main(String args[]){
        try{ 
             int arr[]=new int[5];
            // here we have intialized an array of size 5

             // accessing value at 7th element 0 1 2 3 4 5 6
             System.out.println(arr[6]); 
             //exception will occur as Invalid array index

             }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : Invalid array index");
        }
    }
}