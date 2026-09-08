import java.util.Scanner;

public class PROG3 {
    //CALCULTING SUM AND AVERAGE OF 6 SUBJECT MAKRS IN AN ARRAY
    public static void main(String args[]){
        int arr[]= new int[6];
        int sum =0;
        double average;
       try(Scanner scan = new Scanner(System.in)){      
          for(int i=0;i<6;i++){
            System.out.println("ENTER MARKS OF EACH SUBJECT "+i);
            arr[i]=scan.nextInt(); }}
    for(int i=0;i<6;i++){
        sum+=arr[i]; }
    average=sum/6;
    System.out.println("SUM OF MARKS :"+sum);
    System.out.println("AVERAGE OF MARKS :"+average);} }
