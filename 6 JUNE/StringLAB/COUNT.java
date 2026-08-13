

import java.util.*;

public class COUNT {
    public static void main(String args[]){
       try(Scanner scan = new Scanner(System.in)){
        System.out.println("ENTER YOUR STRING FOR COUNTING NUMBER OF WORDS, VOCELS ,CONSONANTS AND SPACE");
        String s = scan.nextLine();
        int digits=0;
        int vowels=0;
        int consonants=0;
        int space=0; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }else if(ch>='a' && ch<='z'){
                consonants++;
            }else if(ch>='A' && ch<='Z'){
                consonants++;
            }else if(ch==' '){
                space++;
            }else if(ch>='0' &&ch<='9'){
                digits++;
            } 
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + space);
        System.out.println("Digits: " + digits);

     }
    }
}
