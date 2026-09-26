import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int number=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            sum+=digit*digit*digit;
            num=num/10;
        }
        if(number==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}
