import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        int count=0;
        int num;

        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        while(num>0){
            int digit=num%10;
            count+=1;
            num=num/10;
        }
        System.out.println("Number of digits in a number are:"+ count);
    }
}
