public class VARIABLE {
    static int m = 100; // static variable
    int n = 10; // instance variable

    void local1() {
        int e = 100; // local variable
        VARIABLE demo = new VARIABLE();
        System.out.println("Static variable m = " + VARIABLE.m);
        System.out.println("Instance variable n = " + demo.n);
        System.out.println("Local variable e = " + e);
    }

    public static void main(String[] args) {
        VARIABLE obj = new VARIABLE();
        obj.local1();
    }
}
// In an instance method, we can directly access any static variable, instance variable, and instance method.
// A static method can directly access static variables.
// main is a static method, so we c+reate an object to call instance methods and access instance variables.
