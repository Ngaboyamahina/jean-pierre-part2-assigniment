 class SingleEntitypierre {

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person individual = new Person();

        // Setting information using methods
        individual.setName("John Doe");
        individual.setAge(25);

        // Displaying information using methods
        individual.displayInformation();
    }
}

// A class representing a single person
class Person {
    private String name;
    private int age;

    // Method to set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Method to set the age of the person
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}