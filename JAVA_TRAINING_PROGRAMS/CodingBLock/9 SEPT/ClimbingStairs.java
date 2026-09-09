public class ClimbingStairs {
    public static void main(String args[]){
        int n=3;
        int ways=solve(n,"");
        System.out.println("Ways to CLimb "+ways);
    }
    private static int solve(int n,String path){
        if(n==0 || n==1){
            System.out.println("Path "+path+n);
              return 1;
        }
        int a=solve(n-1,path+1);
        int b=solve(n-2,path+2);
        return a+b;
    }

}