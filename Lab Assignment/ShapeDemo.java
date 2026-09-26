abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {                                                                                              
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class ShapeDemo {

    public static void main(String[] args) {

        System.out.println("""
                Name: Inu Chetry
                URN : 2581328
                """);
                
        Circle c = new Circle(5);
        c.area();

        Rectangle r = new Rectangle(10, 5);
        r.area();
    }
}