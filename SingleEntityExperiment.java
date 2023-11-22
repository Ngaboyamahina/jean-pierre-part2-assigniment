 class SingleEntityExperiment {

    public static void main(String[] args) {
        // Creating an instance of the SingleEntity class
        SingleEntity myEntity = new SingleEntity();

        // Calling methods on the single entity
        myEntity.displayInfo();
        myEntity.performOperation();
    }
}

// A class representing a single entity
class SingleEntity {

    // Method to display information about the entity
    public void displayInfo() {
        System.out.println("This is a single entity.");
    }

    // Method to perform some operation on the entity
    public void performOperation() {
        System.out.println("Performing an operation on the single entity.");
    }
}