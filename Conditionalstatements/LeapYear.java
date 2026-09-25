import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");

        year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
            }
            else{
              System.out.println(year+" a leap year");
            }
            
        }
        else{
              System.out.println(year+" is not a leap year");
        }

    }
}
