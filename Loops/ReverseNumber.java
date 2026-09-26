import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a number:");
        num=sc.nextInt();
        int rev=0;

        while(num>0){
            int digit=num%10;
            rev= rev*10+digit ;
            num=num/10;
        }
        System.out.println("Reverse of the given number is:"+rev);
    }
}
