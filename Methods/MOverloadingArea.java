public class MOverloadingArea {
    static void Area(int l,int b){
        System.out.println("Area of Rectangle:"+ l*b);
    }
    static void Area(int r){
        System.out.println("Area of Circle:"+Math.PI*r*r);
    }
    static void Area(int l,int b, int h){
        System.out.println("Area of Trapezium:"+0.5*(l+b)*h);
    }
    public static void main(String []args){
        Area(5,6);
        Area(4);
        Area(5,6,2);
    }
}
