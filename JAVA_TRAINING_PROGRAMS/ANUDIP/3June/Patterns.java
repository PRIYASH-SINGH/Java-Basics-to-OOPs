import java.util.*;
public class Patterns{
    public static void main(String args[]){
        //for(intialization ; condition ; increment / decrement ){}
        //while(true){} //infinte loop
        //PATTEN PRINTING
        try(Scanner input=new Scanner(System.in)){
            System.out.print("ENTER VALUE FOR  TRIANGLE");
            int n= input.nextInt();
 
 // RIGHT ALIGNED PATTERN TRIANGLE
      /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
//LEFT ALIGNED PATTERN TRIANGLE 
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
// PYRAMID  
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
// DOWNWARD PYRAMID
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");}
           for(int j=1;j<=2*i-1;j++){
                        System.out.print("*");
                    }
            System.out.println();
                }
            }
        }
    }
