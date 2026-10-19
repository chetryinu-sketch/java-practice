class Rectangle1{

    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length*breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Rectangle1 R1 = new Rectangle1();
        Rectangle1 R2 = new Rectangle1();

        R1.length=5;
        R1.breadth=4;

        R2.length=8;
        R2.breadth=8;

        System.out.println("Area:"+R1.area());
        System.out.println("perimeter:"+R1.perimeter());
        System.out.println("isSquare:"+R1.isSquare());

        System.out.println("Area:"+R2.area());
        System.out.println("perimeter:"+R2.perimeter());
        System.out.println("isSquare:"+R2.isSquare());
        
    }
}
