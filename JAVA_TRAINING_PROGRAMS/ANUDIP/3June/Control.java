import java.util.*;
public class Control {
    public static void main(String args[]){
     //if(){} control statement
     //if(){}else{} control statement
     //if(){}else if(){}else{} control statement //if else ladder
     try(Scanner input= new Scanner(System.in)){
        System.out.println("ENTER YOUR MARKS:");
      int marks = input.nextInt();
      char ch=input.next().charAt(0); 
/*input.next() reads the next string token
.charAt(0) extracts the first character from that string
This assigns a single char to ch*/


        /*if(91<marks && marks<101){
            System.out.println("GRADE A AT MARKS "+marks);
        }
        else if(81<marks && marks <91){
            System.out.println("GRADE B AT MARKS "+marks);
        }
        else if(71<marks && marks<81){
            System.out.println("GRADE C AT MARKS "+marks);
        }
        else{
            System.out.println("GRADE D AT MARKS "+marks);
        } */


       switch(marks){ // Rule Switch uses arroe -> 
        case (90) : System.out.println("GRADE A");
        break;// if break statemnet removed 
        //than it will print all comsecutive cases
        case (80) : System.out.println("GRADE B");
        break;
        default : System.out.println("GRADE C");
       //cant give ranges of anyy kind in switch case
       }
       switch(ch){ 
/*Use single quotes 'a' for character literals, not parentheses (a)
Rule switch (->) doesn't need break
If ch is a String, use double quotes: case "a" -> */

        case 'a' -> System.out.println("Vowel");
        case 'b' -> System.out.println("Consonant");
        default -> System.out.println("Alphabet");
       }
     }
     

    }
}