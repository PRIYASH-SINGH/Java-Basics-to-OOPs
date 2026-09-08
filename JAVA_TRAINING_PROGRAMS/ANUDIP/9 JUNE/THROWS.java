//in case of multiple exceptions super class exceptions are mentiondedc last for compilre to catch 
        //class Exception e = new Exception("error"); throw e; can be used to throw any exception 
        //throw vs throws

       /* throw -> used to throw an exception
        throws -> used to declare that a method may throw an exception 
        
        throw is keyword
        throws is used to declare that a method may throw an exception 
        
        throw is used to throw an exception
        throws is used to declare that a method may throw an exception */
        
import java.io.*;

public class THROWS {
    static void ValidAge(int age){
        if(age<17) throw new ArithmeticException("Age not valide");
        else System.out.println("Age is valid");
    }
    static void showIO() throws IOException{
        throw new IOException("IO Exception"); }
    public static void main(String args[]) throws IOException{
        ValidAge(20);
        System.out.println("CODE IS HANDLED AND EXICUTED SUCCESSFULLY");
        showIO();
        System.out.println("CODE IS HANDLED AND EXICUTED SUCCESSFULLY");
    }
}

// NESTED LOOP TRY CATCH SYNTAX     
/*
try{

    try{
        
    }catch(Exception e){
        
    }
}catch(Exception e){
    
}*/
// DIFF BETWEEN FINAL , FINALLY ,FINALIZE
/*final-> used to declare a variable as constant , used to prevent method overriding  
finally -> used to declare a block of code that will be executed whether an exception is thrown or not 
finalize -> used to release the resources held by an object before it is garbage collected */   
//final int a=10; // to make it constant 
//finally {} // to make it executable if exception is thrown or not
//finalize() {} // to release the resources held by an object before it is garbage collected 
