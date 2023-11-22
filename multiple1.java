class MultipleInheritanceExample {
    public static void main(String[] args) {

interface Flying {
    void fly();
}

// Second interface
interface Swimming {
    void swim();
}

// Concrete class implementing both interfaces
class Bird implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The bird is swimming.");
    }

    void displayInfo() {
        System.out.println("This is a bird.");
    }
}

 
        // Creating an object of the class Bird
        Bird bird = new Bird();

        // Calling methods from both interfaces
        bird.fly();
        bird.swim();

        // Calling a method from the class itself
        bird.displayInfo();
    }
}