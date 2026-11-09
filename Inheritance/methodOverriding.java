class TV
{
    public void switchON(){
        System.out.println("TV is Switched On");
    }
    public void changeChannel(){
        System.out.println("TV Channel is Changed");
    }

}
class SmartTV extends TV{
    @Override 
    public void switchON(){
        System.out.println("Smart TV is Switched ON");
    }
    @Override 
    public void changeChannel(){
        System.out.println("SmartTV Channel is Changed");
    }

}

public class methodOverriding {
    public static void main(String[] args) {
        TV t=new SmartTV();  //the object of smart TV is created that's why the method of smart TV is called  
        t.switchON();        //If we are use super class as referance class and object of sub class then 
        t.changeChannel();   //then we cann't call the method which are not in super class
        
    }
}
