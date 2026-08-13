import java.util.*;
public class Car {
    String make;
    String model;
    short year;
    int price;

    //we can pass values directly to instance variables
    public Car(String make, String model, short year, int price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price; }
    //method to display car details
     public void cardetails(){
        System.out.println("MAKE :"+make);
        System.out.println("MODEL :"+model);
        System.out.println("YEAR:"+year);
        System.out.println("PRICE :"+price);
     } 
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER CAR MAKE :");
        String make =scan.nextLine();
        System.out.println("ENTER CAR MODEL :");
        String model = scan.nextLine();
        System.out.println("ENTER YEAR:");
        short year = scan.nextShort();
        System.out.println("ENTER PRICE:");
        int price=scan.nextInt();
        scan.close();
         //creating instance of car using constructor
         Car c1 = new Car(make,model,year,price);
         c1.cardetails();
}
}