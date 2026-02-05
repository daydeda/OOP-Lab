package Animal;
public class Dog extends Animal {
    // Overriding the base class method
    // The @Override annotation is good practice to ensure the method signature matches
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}