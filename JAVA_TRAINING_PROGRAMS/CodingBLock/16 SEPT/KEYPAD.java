
public class KEYPAD {
    //A global array containing keypad letters for each no 0-9
    static String[] s={"","","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String args[]){
    printing("23",""); 
    //printing possible combination of letters

    }
    private static void printing(String digit,String ans)// digit = 23 , ans=" "
    {
        if(digit.length()==0)//2!=0
            {
            System.out.println(ans);
            return;
        }
        char ch=digit.charAt(0);//for 23 first it take 2
        String key=s[ch-48];//it will give key "abc" because ascii value of 2 is 50 and 48 is the ascii value of 0
        for(int i=0;i<key.length();i++)
            {
            printing(digit.substring(1),ans+key.charAt(i));
            //for i=0 it will call printing("3","a") and for i=1 it will call printing("3","b")
        }
    }
    
}
