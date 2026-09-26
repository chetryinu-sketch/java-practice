
import java.util.*;
public class DisplayDigits {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number whose digits you wanna display:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int i=1;
        while(n>0){
            int digit = n%10;
            n = n/10 ;
            
            System.out.println("Digits of the number are:" +digit);

        }

    }
}
