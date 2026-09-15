

public class StringPermutation2 {
    // No package declaration needed for standalone practice files
    public static void main(String args[]){
        String str="abc";
        solve(str,"");//Function call 
    }
    public static void solve(String str,String ans)
    {
        if(str.length()==0)//when string length becomes zero return the permutation list
            {
            System.out.println(ans);
            return;
        }
        solve(str.substring(1),ans+str.charAt(0));
        //include the first char in the ans and remove it from the str
        solve(str.substring(1),ans);
        //exclude the first char from the ans and remove it from the str
        
    }
}
