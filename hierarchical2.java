class HierarchicalInheritance {
    public static void main(String[] args) {

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// The derived class 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// The derived class 2
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }
}

// The derived class 3
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle.");
    }
}

 
        // Creating objects of the derived classes
        Circle myCircle = new Circle();
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();

        // Accessing overridden methods
        myCircle.draw();    // Calls draw() from Circle
        mySquare.draw();    // Calls draw() from Square
        myTriangle.draw();  // Calls draw() from Triangle
    }
}