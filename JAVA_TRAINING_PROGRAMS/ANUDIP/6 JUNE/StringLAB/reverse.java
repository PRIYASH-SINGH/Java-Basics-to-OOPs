
import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in); 
        //creating scanner class for input 
        System.out.println("ENTER YOUR STRING FOR REVERSAL");
        String s=scan.nextLine(); 
        //taking input for string 
        StringBuffer s1=new StringBuffer(s);
         //creating stringbuffer to make string mutable and reverse it 
         String s2=s1.reverse().toString();
        
         // converting REVERSE stringbuffer to string
        //System.out.println("REVERSED STRING IS : "+s2);
        
        //PALINDROME CHECKING
        if(s2.equalsIgnoreCase(s)){
            System.out.print(s+" is PANLINDROME");
        }else{
            System.out.print(s+" is NOT PALINDROME");
        }
        scan.close(); //closing scanner 
    }

}
