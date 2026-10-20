class Rectangle
{
    private double length;
    private double breadth;

    public Rectangle()
    {
        length=1;
        breadth=1;
        System.out.println(length+" and "+breadth);
    }

    public Rectangle(double l,double b)
    {
        length=1;
        breadth=b;
        System.out.println(length+" and "+breadth);
    }
    public Rectangle(double s)
    {
        length=breadth=s;
        System.out.println(length+" and "+breadth);
    }
}

public class Constructor{
    public static void main(String[] args) {

        Rectangle r = new Rectangle(); //non perameterized constructor is called
        Rectangle r1 = new Rectangle(5,3);
        Rectangle r2 = new Rectangle(5);
    }
}