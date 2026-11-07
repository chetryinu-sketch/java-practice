class Car{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear CHanged");}

}
class LuxaryCar extends Car{
    @Override 
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
}

public class OverridingExample {
    public static void main(String[] args) {
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        // c.openRoof();    if we are using reference of super class and object of child class then the method called must be in the parent class
        
    }
}
