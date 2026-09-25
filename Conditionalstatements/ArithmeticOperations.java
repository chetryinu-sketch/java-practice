import java.util.*;
public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("""
                ----------Menu----------
                1.ADD
                2.SUb
                3.MUL
                4.DIV
                """);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter option in words:");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch(option){
            case "ADD":
                System.out.println("Addition of 2 number num1 and num2 is:"+(num1+num2));
                break;
            case "SUB":
                System.out.println("Subtraction of 2 number num1 and num2 is:"+(num1-num2));
                break;
            case "MUL":
                System.out.println("Multiplication of 2 number num1 and num2 is:"+(num1*num2));
                break;
            case "DIV":
                System.out.println("Division of 2 number num1 and num2 is:"+(num1%num2));
                break;
            default: System.out.println("Invalid option");
            break;
        }
    }
}
