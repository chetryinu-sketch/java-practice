// 2. Write a program using while/do-while loops to find the sum of digits of a number and
// to print a number pattern (e.g., a pyramid of stars).

import java.util.Scanner;

public class LoopProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0)
        {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

        System.out.print("\nEnter number of rows: ");
        int rows = sc.nextInt();

        int i = 1;

        do
        {
            int space = rows - i;

            while (space > 0)
            {
                System.out.print(" ");
                space--;
            }

            int star = 1;

            while (star <= (2 * i - 1))
            {
                System.out.print("*");
                star++;
            }

            System.out.println();
            i++;

        } while (i <= rows);
        
        sc.close();
    }
}