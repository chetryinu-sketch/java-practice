class Rectangle
{
    int length;
    int breadth;
    
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}
    class Cuboid extends Rectangle{
        int height;
        int x=20;

        Cuboid(int l,int b,int h){
            super(l,b);
            height=h;
        }
    
    void display()
    {
        System.out.println("Length:"+super.length);
        System.out.println(x);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        Cuboid C1 = new Cuboid(23, 9,10);
        C1.display();
        
    }
}
