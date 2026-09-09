public class Strings {
    public static void main(String[] args){
        String s="nitiin";
        System.out.println("Is String "+s+" palindrome ? "+palindrome(s)); 
        //finding palindromic string
        System.out.println("Is String "+s+" contains palindromic substring "); 
        //finding all palindromic substring
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String str=s.substring(i,j);
                if(palindrome(str))
                {
                    System.out.println(str);
                }
            }
        }   

    }
    private static boolean palindrome(String s){
       int Lptr=0;
       int Rptr=s.length()-1;
          while(Lptr<=Rptr){
               if(s.charAt(Lptr)!=s.charAt(Rptr)){
                  return false;
               }
               Lptr++;
               Rptr--;
          }
          return true;
    }

}

