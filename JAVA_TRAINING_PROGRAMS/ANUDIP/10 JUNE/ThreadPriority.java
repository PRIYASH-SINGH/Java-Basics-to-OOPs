public class ThreadPriority extends Thread{
    public void run()
    {
     for(int i=1;i<=5;i++) // this loop is for printing the values
    {
        try{
            Thread.sleep(2000); // this is for pausing the thread for 2 seconds
            System.out.println(Thread.currentThread().getName()+" "+i);// here we are printing the values
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    }
    public static void main(String args[])
    {
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        ThreadPriority t3=new ThreadPriority();
        ThreadPriority t4=new ThreadPriority();
        ThreadPriority t5=new ThreadPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(3);
        t5.setPriority(9);
        t1.setName("THREAD-1");

        t1.start();// here we are starting the threads
        t2.start();// here we are starting other threads
        t3.start();// here we are starting other threads
        System.out.println(t1.getPriority()+t1.getName());

        //joining threads
        t1.start();{
            try{
                t1.join();// it means that this thread will wait for other threads to complete before starting
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
            t2.start();// here we are starting other threads
            t3.start(); 
            t4.start();
            t5.start(); 
        }
    }
}
