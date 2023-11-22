 class HierarchicalInheritanceExample {
    public static void main(String[] args) {
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// The derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// The derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}


        // Creating objects of the derived classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Accessing methods of the base class
        myDog.eat(); // Inherited from Animal
        myCat.eat(); // Inherited from Animal

        // Accessing methods specific to each derived class
        myDog.bark(); // Specific to Dog
        myCat.meow(); // Specific to Cat
    }
}