import java.util.Scanner;


public class RightAreaTriangle {
    public static void main(String args[]){
       
        float b,h,area;

        System.out.println("Enter base and height:");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();
        area=0.5f*b*h;
        
        System.out.println("Are:"  + area);

    }
}


