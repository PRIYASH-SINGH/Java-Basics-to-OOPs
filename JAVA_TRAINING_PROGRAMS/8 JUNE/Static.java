

public class Static {
     //can we excecute a program without main method?
     // Ans: No, because main method is the entry point of the program
     // and it is called by the JVM without creating an object of the class 
     //before jdk 1.7 it was possible to excecute a program without main method using static block
     //but from jdk 1.7 it is not possible
     // static block can run without object creation
     static{
        System.out.println("Static block");
     }
    
    //example of static method performing normal calculation
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        int result= add(10,20);
        System.out.println("Result :"+result);
    }
    // why main method is static?
    // because it is the entry point of the program and it is called by the JVM
    // without creating an object of the class 
    //static variable are class variables and are shared by all objects of the class
    //instance variables are object variables and are not shared by all objects of the class
    //static variables are initialized when the class is loaded into memory
    //instance variables are initialized when an object of the class is created
    //static variables are stored in the stack memory
    //instance variables are stored in the heap memory
    //static method can only access static variables and static methods
    //instance method can access both static and instance variables and methods
    //static variables and methods are not dependent on any object
    //instance variables and methods are dependent on an object 
    //static variables are declared before any instance variables
    //
}
