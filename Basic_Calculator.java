import java.util.*;

public class Basic_Calculator {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!!! You are using worlds most basic Calculator :)");
        System.out.print("Enter FIrst Basic Number OR whatever you want to enter:\n>>>");
        int num1 =scan.nextInt();
        System.out.println("Very Good , Atleast you know how to use a Keyboard ");
        System.out.print("Now . Enter Second Basic Number OR whatever you want to enter \n P.S. please do not enter it , i just want to sleep :\n>>>");
        int num2 =scan.nextInt();
        System.out.print("Choose What you want to do with them . \n Your Options are : \n 1.Jordo (Addition)\n 2.Ghatado (Subtraction) \n 3.Gunaj (Multiple) \n 4.Bhaag (Divide) \n 5.Zameen Bhaag(Floor Division) \n >>> ");
        int choice=scan.nextInt();
        switch(choice) {
            case 1 -> { int result = num1+num2;
                System.out.println("Apka answer ata ha : "+result); }
            case 2-> { int result = num1-num2;
                System.out.println("Apka answer ata ha : "+result); }
            case 3 -> { int result = num1*num2;
                System.out.println("Apka answer ata ha : "+result); }
            case 4 -> { int result = num1%num2;
                System.out.println("Apka answer ata ha : "+result); }
            case 5-> { int result = num1/num2;
                System.out.println("Apka answer ata ha : "+result); }

        }
    }
}