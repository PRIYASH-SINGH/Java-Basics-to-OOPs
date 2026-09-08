

public class Animal {
    void makesound(){
        System.out.println("The animal makes a sound");
    }

    static class Dog extends Animal{
        void makesound(){
            System.out.println("The Dog barks");
        }
    }
    static class Cat extends Animal{
        void makesound(){
            System.out.println("The cat meows");
        }
    }
    public static void main(String args[]){
        Animal a=new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        a.makesound();
        d.makesound();
        c.makesound();
    }

    
}
