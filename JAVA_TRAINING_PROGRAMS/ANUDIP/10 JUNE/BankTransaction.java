
 class BankTransaction extends Thread{
    private String transactionName;
    BankTransaction(String transactionName){//constructor to initialize a transaction object
        this.transactionName=transactionName; //it will give a name to the thread
        
    }
    public void run(){
        System.out.println(transactionName+"Under Process..");
        //use thread.sleep for creating delay between transactions
        //used for maintaining delay between transactions or tasks
        try{
            Thread.sleep(5000);//5 sec gap
        }catch(InterruptedException ie)//if this exception is thrown
        {
            ie.printStackTrace();//print exception trace in console
        }
        System.out.println(transactionName+"Completed");
    }
    public static void main(String args[]){
        System.out.println("Welcome to Banking system");
        BankTransaction withdraw=new BankTransaction("Withdrawal..");//object of thread
        BankTransaction deposit=new BankTransaction("Deposit..");//object of thread
        BankTransaction checkBalance=new BankTransaction("Check Balance");//object of thread
        //start method is used to start a thread
        withdraw.start();//if t1 is executed first
        deposit.start();//depends on scheduler which thread is executed first
        checkBalance.start();//then t will get priority

    }
 }

