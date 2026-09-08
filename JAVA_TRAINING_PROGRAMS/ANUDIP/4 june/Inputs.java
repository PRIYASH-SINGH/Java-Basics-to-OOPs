import java.util.*;

public class Inputs {
    public static void main(String args[]){
        //Create a scanner object attached to standard input STDIN
        Scanner anyvar = new Scanner(System.in); //opens up input console wth risk of memory leak 
        //to prevent memory leak we use try with resources

        System.out.println("Enter STRING VALUE:");
        String s =anyvar.nextLine(); // we only have create scanner once , 
        //then just change the var data type and next<Type>()
        System.out.println("Enter INTEGER VALUE:");
        int n= anyvar.nextInt();

        System.out.println("STRING: "+s+" INTEGER: "+n);
        anyvar.close();

    }
}