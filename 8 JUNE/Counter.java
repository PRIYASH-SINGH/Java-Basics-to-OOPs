
public class Counter {
    int count;
    //it shows how instances variables work
    //
    public Counter(){
        count++;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        System.out.println("c1 counter value: " + c1.count);

        Counter c2 = new Counter();
        System.out.println("c2 counter value: " + c2.count);

        Counter c3 = new Counter();
        System.out.println("c3 counter value: " + c3.count);
    }
}
