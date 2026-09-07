
public class Fibonnaci {
    public static void main(String[] args) {
        int n=8;
        int result=fib(n);
        System.out.println("Fibonnaci Sum Till number "+n+" = "+result);
    }
    private static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        int a=fib(n-1);
        int b=fib(n-2);
        return a+b;
        
    }
}