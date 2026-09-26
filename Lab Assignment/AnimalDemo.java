class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        System.out.println("""
                Name: Inu Chetry
                URN: 2581328
                """);

        // Parent class reference
        Animal obj;

        // Reference refers to Animal object
        obj = new Animal();
        obj.sound();

        // Reference refers to Dog object
        obj = new Dog();
        obj.sound();
    }
}