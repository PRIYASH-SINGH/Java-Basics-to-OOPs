
public class ThreadEx extends Thread {
    
    //overriding run method
    public void run(){
        System.out.println("user defined child thread is running");
    }

    public static void main(String[] args)
    {
        System.out.println("MAIN thread is running");//main thread started
        ThreadEx t1=new ThreadEx();
         ThreadEx2 t2=new ThreadEx2();
        t1.start();//it will call run method directly without explicityl calling run method
        //we can create multiple threads for different objects
        t2.start();
    }
}
//while overriding a function we can wider its visiblity but can reduce its visibility from public to private
    
class ThreadEx2 extends Thread {
    public void run(){
        System.out.println("user defined child thread is running in threadEX2");
    }
}
