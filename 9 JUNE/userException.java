public class userException{
    public static void main(){
        throw new WrongFileNameException("FILE NOT FOUND"); //
    }
    static class WrongFileNameException extends RuntimeException{
        WrongFileNameException(String s){
            super(s);
        }
    }
}   
// ------------------------------->
/* OUTPUT
Exception in thread "main" userException$WrongFileNameException: FILE NOT FOUND
    at userException.main(userException.java:3)
*/
// ------------------------------->