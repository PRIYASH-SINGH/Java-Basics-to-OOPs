public class Implementation {
    //implementation of interface
    interface A{
        void show();
    }
    class B implements A{
        public void show(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
