// using labels like aa: outerloop , bb: innerloop , break aa; 
//if(condition){break;}
//for(){if(break condition){break;}}
// continue: jumps to next iteration on the loop , skips the current value of the loop 
import java.util.*;
public class breaks {
    public static void main(String args[]){
        try(Scanner input= new Scanner(System.in)){
            System.out.print("VALUE:");
            int n=input.nextInt();
            aa:
        for(int i=1;i<=n;i++){
            // bb:
            for(int j=1;j<=n;j++){
              if(i==2&&j==2){
                // break; //brekas at 2 2 , skips 2 3 inner loop starts at 3
                 break aa; //stops at 2 1 breaks outer loop 
                 //break bb = break
                 //continue ; //skips only 2 2 , starts at ext iteration 2 3

              }
              System.out.println(i+" "+j);
            }

        }
    }
}}