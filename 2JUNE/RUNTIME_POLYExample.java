// Superclass declaration for runtime polymorphism
class RUNTIME_POLY {
    // Superclass method that can be overridden by subclasses
    void display() {
        // Print a message showing this method is from the superclass
        System.out.println("Display method in superclass RUNTIME_POLY");
    }
}

// Subclass B extends the superclass RUNTIME_POLY
class B extends RUNTIME_POLY {
    @Override
    // Override the superclass display method with subclass behavior
    void display() {
        // Print a different message showing the subclass method runs
        System.out.println("Display method in subclass B");
    }
}

// Public class containing the main method
public class RUNTIME_POLYExample {
    public static void main(String[] args) {
        // Declare a reference variable of superclass type
        RUNTIME_POLY reference;

        // Create an object of the superclass
        reference = new RUNTIME_POLY();
        // Call display(); this runs the superclass version because the object is RUNTIME_POLY
        reference.display();

        // Create an object of the subclass B
        reference = new B();
        // Call display(); at runtime Java chooses the subclass version because the actual object is B
        reference.display();
    }
}