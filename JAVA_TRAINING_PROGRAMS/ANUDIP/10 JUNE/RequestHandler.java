 class RequestHandler extends Thread {
    
    private  int requestsID;
    private String requestsNAME;
    static int count=0;    
    RequestHandler(int requestsID, String requestsNAME){
        this.requestsID=requestsID;
        this.requestsNAME=requestsNAME;
    }
    public void run(){
        System.out.println("Request SENT..."+requestsNAME);
        count++;
        try{
            System.out.println("Request is under process...");
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Request Completed : "+requestsID);
    }
    
    public static void main(String args[]){
        RequestHandler t1=new RequestHandler(1,"request 1");
        RequestHandler t2=new RequestHandler(2,"request 2");
        RequestHandler t3=new RequestHandler(3,"request 3");
        RequestHandler t4=new RequestHandler(4,"request 4");
        RequestHandler t5=new RequestHandler(5,"request 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
 }