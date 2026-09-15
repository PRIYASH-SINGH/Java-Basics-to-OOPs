// No package declaration needed for standalone practice files

public class StringPermutation{
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
        for(int i=0;i<str.length();i++)//loop run for the whole string lengthh
        {
            char ch=str.charAt(i);//function run for the string first character
            String ros=str.substring(0,i)+str.substring(i+1);//rest of string except first character
            solve(ros,ans+ch);//function call

            //backtracking
            solve(str.substring())
        }
    }
}