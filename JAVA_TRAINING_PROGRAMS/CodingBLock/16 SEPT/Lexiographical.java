public class Lexiographical 
// print numbers from 1 to n in lexicographical order
//  which means alphabetical order of numbers
{
   public static void main(String[] args)
   {
    int n=13;
    for(int i=1;i<10;i++)//loop for 1 to 9
    {
        solve(n,i);// passing ans=1 to 9 in solve method
    }
   }
   private static void solve(int n,int ans)
   {
        if(ans>n)// base case
        {
            return;
        }
        System.out.println(ans);// print ans
        for(int i=0;i<10;i++)//loop for appending 0 to 9 with ans
        {
            solve(n,ans*10+i);// recursive call
        }
    }
   }
    

