import java.util.*;

public class PROG5 {
    public static void main(String args[]){
        int arr[]=new int[5]; 
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
        System.out.println("Enter Student "+(i+1)+" ID :");
        arr[i]=scan.nextInt();
    }
    System.out.println("ENTER ID YOU WANT TO FIND :");
     int a=scan.nextInt();
     scan.close();
     for(int i=0;i<5;i++)
        {
        if(a==arr[i])
            {
            System.out.println("Found the ID "+a+" at position "+(i+1));    
            } } } }
