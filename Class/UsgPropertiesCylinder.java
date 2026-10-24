class Cylinder{

    private int radius;
    private int height;

    public Cylinder()
    {
        int  radius=height=1;
        
    }
    public Cylinder(int r,int h)
    {
        int  radius=r;
        int  height=h;
    }
    public int getRadius()
    {
        return radius;
        
    }
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setDimensions(int h,int r){
        height=h;
        radius=r;
    }
    public double lidArea()
    {
        return Math.PI*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
    
}

public class UsgPropertiesCylinder{
    public static void main(String []args){

        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10,7);

        System.out.println("LidArea: "+c.lidArea());
        System.out.println("Circumferrence: "+c.perimeter());
        // System.out.println("totalSurfaceArea
        // :" +c.drumArea());
        System.out.println("Volume: "+c.volume());
        System.out.println("Height: "+c.getHeight());
        System.out.println("Radius: "+c.getRadius());

    }
}