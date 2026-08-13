import java.util.*;

public class VAR {
    int num;//instance variable
    String name;//instance variable
    static int roll=140;//static variable
    public static void main(String args[]){
        VAR obj= new VAR();//object creation 
        try(Scanner scan= new Scanner(System.in))//creating scanner class for input
        {
        System.out.println("ENTER NAME in instance variable:");
        obj.name=scan.nextLine();//taking input for instance variable name 
        System.out.println("NUM entered for the instance variable:");
        obj.num=scan.nextInt();//taking input for instance variable num
        }
        System.out.println(obj.name+" "+obj.num+" "+VAR.roll);//accessing instance and static variable 
        // roll can be accessed by class name
        System.out.println(obj.name+" "+obj.num+" "+roll);//roll can also be accessed by object name 
        // but it can lead to ambiguity if we have a local variable 
        // for example if we have a local variable with the same name 
        // int roll=10; 
        // System.out.println(roll); // this will print the local variable 
        // System.out.println(VAR.roll); // this will print the static variable 
    }
    

}
