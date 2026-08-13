//thread Life cycle
    //1.NEW : A new thread is born and it is in the waiting state
    //2.RUNNABLE : The thread is ready to start its journey 
    //3.RUNNING : The thread is running and performing its task 
    //4.BLOCKED : The thread is blocked and waiting for something 
    //5.DEAD : The thread has finished its journey
    
 class ThreadLifeCycle implements Runnable { //
    
    //implements its run function
    public void run(){
        System.out.println("Executing user defined thread");
    } 

}
 
  public class Main{
    public static void main(String[] args){
        System.out.println("Main thread started");
        ThreadLifeCycle tel= new ThreadLifeCycle();
        Thread t = new Thread(tel);
        t.start();
    }
  }
