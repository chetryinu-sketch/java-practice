import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            float a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            float result = a/b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");
        }
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}

