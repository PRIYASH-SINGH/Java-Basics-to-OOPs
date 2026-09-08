// if a program comes acroos an exception than it will terminate abruptley
// in such cases we use try catch block to handle the exception 
// in case of multi exception try and catch which ever is called first will execute
// if exception is not handled then the program will terminate
// if exception is handled then the program will continue

public class Handling {
       //method m throws an ArithmeticException
       void m(){
        int a=50;
        int b=a/0;
       }
       //method n calls m()
       void n(){
        m();//exception not handled here
       }
       //method p calls n()
       void p() {
        try {
            n();//calls n
        }
        catch(Exception e){
            System.out.println("Exception caught in p() method");
        }
       }
       public static void main(String[] args) {
        Handling h = new Handling();
        h.p();//calls p and exception is handled here 
        //starts the chain m() -> n() -> p() -> handled in p()
        //if exception is not handled then the program will terminate
        System.out.println("EXECUTED SUCCESSFULLY");
       }
}
