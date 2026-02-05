public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("--- Testing Base Class ---");
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Calls the method in Animal

        System.out.println("\n--- Testing Derived Class ---");
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in Dog

        System.out.println("\n--- Testing Polymorphism (Runtime) ---");
        // A Dog object stored in an Animal reference still behaves like a Dog.
        Animal polyDog = new Dog();
        polyDog.makeSound();
    }
}
