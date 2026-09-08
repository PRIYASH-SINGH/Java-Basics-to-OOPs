//Excepions are errors that occur during the execution of a program
//they are handled using try catch blocks 
//types of exceptions : checked,unchecked,runtime,error
//throwable->error,exception
//exception->checked,runtime,error->stackoverflowerror,outofmemoryerror
public class EXCEPTIONS {
    public static void main(String args[]){
        try{
        //risky code
    }catch(ArithmeticException e){
        //handle the exception
    }finally{
        //always executed
    }

    try{
        int a=10/0; //throw exception
        System.out.println(a); //not executed because exception is thrown
    }catch(ArithmeticException e){
        System.out.println("Error :"+e.getMessage());//print error message
    }finally{
        System.out.println("always executed");
    }
    //Nullpointer exception
    try{
        String s=null;
        System.out.println(s.length());
    }catch(NullPointerException e){
        System.out.println("Error :"+e.getMessage());
    }finally{
        System.out.println("always executed");
    }

    //Numberformat exception
    try{
        String s="abc";
        int a=Integer.parseInt(s);//throw exception
        System.out.println(a);//not executed because exception is thrown
    }catch(NumberFormatException e){
        System.out.println("Error :"+e.getMessage());//print error message
    }finally{
        System.out.println("always executed");
    }
    //ArrayIndexOutOfBoundsException
    try{
        int arr[]=new int[5];
        arr[10]=10;
        System.out.println(arr[10]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error :"+e.getMessage());
    }finally{
        System.out.println("always executed");
    }
    
}
}