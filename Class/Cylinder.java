class Cylinder1{

    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;

    }
    public double totalSurfaceArea(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}


public class Cylinder {
    public static void main(String[] args) {
        
        Cylinder1 obj1 = new Cylinder1();

        obj1.height=5;
        obj1.radius=3;

        System.out.println("Area:"+obj1.lidArea());
        System.out.println("TotalSurfaceArea:"+obj1.totalSurfaceArea());
        System.out.println("Volume:"+obj1.volume());
    }
}
