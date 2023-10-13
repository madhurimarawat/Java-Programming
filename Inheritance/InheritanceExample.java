// Parent class
class Animal {
    // Fields
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to make the animal make a sound
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Additional field specific to Dog class
    String breed;

    // Constructor for Dog class
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the parent class
        this.breed = breed;
    }

    // Override the makeSound method to provide a specific implementation for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks loudly.");
    }

    // Method to display Dog-specific information
    public void displayDogInfo() {
        System.out.println("Breed: " + breed);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        // Create an instance of the Animal class
        Animal genericAnimal = new Animal("Generic Animal", 5);

        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Call methods on the instances
        System.out.println("Information about the generic animal:");
        genericAnimal.displayInfo();
        genericAnimal.makeSound();

        System.out.println("\nInformation about my dog:");
        myDog.displayInfo(); // Inherited method
        myDog.displayDogInfo(); // Dog-specific method
        myDog.makeSound(); // Overridden method
    }
}
/*
Class file is created for each class
    */
