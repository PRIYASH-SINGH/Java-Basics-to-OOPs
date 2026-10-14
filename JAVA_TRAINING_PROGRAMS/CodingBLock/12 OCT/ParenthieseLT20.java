import java.util.*;


public class ParenthieseLT20 {
    
    public static void main(String[] args){
        String s="{}[]()";
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
        char c=s.charAt(i);
         if(c=='('||c=='['||c=='{'){
            st.push(c);
         }
         else{
            if(st.isEmpty()){
                System.out.println(false);
            }
            char top=st.pop();
            if((c=='}'&&top!='{')||
               (c==']' && top!='[')||
               (c==')' && top!='(')){
                System.out.println(false);
               }
            }
               
         }
         System.out.print(st.isEmpty());
        }
    }

    