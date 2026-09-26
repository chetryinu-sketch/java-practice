
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        int num;
        int Fac=1;

        System.out.println("Enter the number of which you want factorial:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for(int i=num;i>=1;i--){
            Fac=Fac*i;
        }
        System.out.println("Factorial:"+ Fac);


    }
}
