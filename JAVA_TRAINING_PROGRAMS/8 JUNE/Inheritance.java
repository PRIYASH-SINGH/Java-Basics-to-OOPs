// Single-level, Multilevel, and Hierarchical Inheritance Demo

// 1. Single-level Inheritance classes
class Employee {
    int salary = 10000;
}

class Programmer extends Employee {
    int bonus = 5000;
}

// 2. Base class for Multilevel & Hierarchical inheritance
class Animal {
    void eat() {
        System.out.println("eating");
    }
    void sleep() {
        System.out.println("sleeping");
    }
}

// 3. Child class for Multilevel (Animal -> Dog -> Puppy)
// Also acts as Child class 1 for Hierarchical
class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

// 4. Child class for Multilevel
class Puppy extends Dog {
    void weep() {
        System.out.println("weeping");
    }
}

// 5. Child class 2 for Hierarchical (Animal -> Cat)
class Cat extends Animal {
    void meow() {
        System.out.println("meowing");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        // --- Single-level inheritance ---
        System.out.println("--- Single-level inheritance ---");
        Programmer e = new Programmer();
        System.out.println("Salary + Bonus = " + (e.salary + e.bonus));
        System.out.println();

        // --- Multilevel inheritance ---
        System.out.println("--- Multilevel inheritance ---");
        Puppy p = new Puppy();
        p.eat();    // inherited from Animal
        p.sleep();  // inherited from Animal
        p.bark();   // inherited from Dog
        p.weep();   // defined in Puppy
        System.out.println();

        // --- Hierarchical Inheritance ---
        System.out.println("--- Hierarchical Inheritance ---");
        System.out.println("Dog (Child 1 of Animal):");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("Cat (Child 2 of Animal):");
        Cat c = new Cat();
        c.eat();    // inherited from Animal
        c.meow();   // defined in Cat
    }
}