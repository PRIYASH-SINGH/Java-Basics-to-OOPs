import java.util.*;

public class Activity1{
    public static void main(String args[]){
        try{ // try block to test if this line of code will give exception or not
            Scanner scan = new Scanner(System.in); 
            // Initializing scanner func to take user input
            System.out.println("Enter First NUMBER :");
            int a=scan.nextInt();
            System.out.println("Enter Second NUMBER :");
            int b=scan.nextInt();
            //either exception or division will be printed 
            System.out.println("IF NO EXCEPTION OCCURE: a/b="+a/b);
            scan.close();
       } 
       catch(ArithmeticException e)
       {
        System.out.println("Exception : Cannot divide by zer0");// exception being handled by catch block
       } finally {
        //finally block is always excecuted no matter the output
        System.out.println("Program execution completed");
       }
    }
}