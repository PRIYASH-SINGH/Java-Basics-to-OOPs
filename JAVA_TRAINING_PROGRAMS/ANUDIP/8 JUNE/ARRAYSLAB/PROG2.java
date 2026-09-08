import java.util.*;

public class PROG2 {
    public static void main(String args[]){
        int arr[]=new int[10];
          try( Scanner scan= new Scanner(System.in)){
           for(int i=0;i<10;i++){
           System.out.println("ENTER IDS OF YOUR EMPLOYEE: "+i);
           arr[i]=scan.nextInt();}
           }
           for(int i=0;i<10;i++){
            System.out.println("EMPLOYEE IDS:"+arr[i]);
           }
    }

}
