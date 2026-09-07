
public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int result=fact(n);
        System.out.println(result);
    }
    private static int fact(int n){
        if(n==1){
            return 1;
        }
        int minus=fact(n-1);
        int chain=minus*n;
        return chain;
        //return n*fact(n-1);
        
    }
}