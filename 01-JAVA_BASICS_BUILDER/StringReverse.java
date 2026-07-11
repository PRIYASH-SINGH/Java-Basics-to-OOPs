import java.util.*;

public class StringReverse {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("TYPE A STRING >>> ");
        String s=scan.nextLine();
        StringBuffer sb=new StringBuffer(s);//as String is immutable 
        //so we change it to string buffer
        String ss=new String(sb.reverse()); //converted rev buffer to string so it doesnt give true on the basis of length
        if(s==ss) {
          System.out.println("ITS A PALINDROME , REVERSED + ORGINAL STRING");
        }
        else {
            System.out.println("NOT A PALIMDROME");
        }
        
    }
}