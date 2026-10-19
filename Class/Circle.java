class Circle1{
    public double radius;
    public double  Area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Circle{
    public static void main(String []args){
        Circle1 C1=new Circle1();
        Circle1 C2=new Circle1();

        C1.radius=5;
        C2.radius=7;

        System.out.println("Area:"+C1.Area());
        System.out.println("perimeter:"+C1.perimeter());
        System.out.println("Circumference:"+C1.circumference());

        System.out.println("Area:"+C2.Area());
        System.out.println("perimeter:"+C2.perimeter());
        System.out.println("Circumference:"+C2.circumference());

    }
}