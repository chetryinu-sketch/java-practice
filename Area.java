class Area {

    private double value;

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        if (value > 0) {
            this.value = value;
        } else {
            System.out.println("Value must be greater than 0.");
        }
    }
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    int calculateArea(int side) {
        return side * side;
    }
    public static void main(String[] args) {

        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");

        Area obj = new Area();

        obj.setValue(10);

        System.out.println("Value: " + obj.getValue());

        double circleArea = obj.calculateArea(5.0);
        double rectangleArea = obj.calculateArea(10.0, 5.0);
        int squareArea = obj.calculateArea(4);

        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
        System.out.println("Area of Square = " + squareArea);

        obj.setValue(-5);
    }
}