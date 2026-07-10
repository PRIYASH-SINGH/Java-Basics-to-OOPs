public class variable1{
    int n = 100;// instance variable
    static int m=10; //static variable
    void display(){
        int l=1; //local variable
        variable1 demo = new variable1();
        System.out .println("INSTANCE VARIABLE: "+demo.n);
        System.out.println("Static Varible:"+variable1.m);
        System.out.println("Local variable:"+l);
    } 
    public static void main(String args[]){
        variable1 obj=new variable1();
        obj.display();
    }
}