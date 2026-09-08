class Overriding{
    final int a=20; //cannot change
    void display(){
        System.out.println("INside parent class");
    }
    public static void main(String args[]){
        Overriding refObj=new Child();
        refObj.display(); //calls child class display() method
        //because refrence is of parent class and object is of child class -> runtime polymorphism
    }
}
class Child extends Overriding{
    //overriding parent class method
    @Override //good practice to add annotation
    void display(){
        System.out.println("INside child class");
    }
}
// OVERRIDING 
// same method name
// same method signature
// same return type
// same exception (or) less exception
// access modifier should be same or higher
// super class should be accessible
// if we want to  call parent class method in child class method we use super.display() method      