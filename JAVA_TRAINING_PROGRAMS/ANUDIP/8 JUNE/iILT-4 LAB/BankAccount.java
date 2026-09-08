
public class BankAccount {
   private String accountHolderName;
   private String bankName;
   private double accountBalance;

   public BankAccount(String accountHolderName, String bankName,double accountBalance){
     this.accountHolderName=accountHolderName;
     this.bankName=bankName;
     this.accountBalance=accountBalance;
    } 

    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void deposit(double amount){
        accountBalance+=amount;
        System.out.println(amount+" Deposited to account "+bankName);
      
    } 
    public void withdraw(double amount){
        if(amount>accountBalance){
            accountBalance-=amount;
            System.out.println(amount+"Withdrawn from account"+bankName);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void display(){
        System.out.println(accountHolderName+" ");
        System.out.println("Bank Name :"+bankName);
        System.out.println("Bank Balance :"+accountBalance);
    }
public static void main(String[] args){
   BankAccount  acc= new BankAccount("Priyash","SBI",50000);
   acc.display();
   acc.deposit(10000);
   acc.withdraw(5000);
   System.out.println("final balnce :"+acc.getAccountBalance());
}
}
