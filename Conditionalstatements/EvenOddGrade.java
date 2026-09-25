// EXPERIMENT 2: Control Structures and Loops CO1
// 1. Write a program using if-else/switch-case to check whether a number is even or odd
// and to calculate a student's grade based on marks entered.

import java.util.Scanner;

public class EvenOddGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name:Inu Chetry");
        System.out.println("URN:2581328");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
                if(num%2==0){
            System.out.println(num +" Even number");
        }
        else{
            System.out.println(num +" Odd number");
        }

        System.out.print("\nEnter student's marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100)
        {
            System.out.println("Invalid marks");
        }
        else
        {
            switch (marks / 10)
            {
                case 10:
                case 9:
                    System.out.println("Grade: A+");
                    break;

                case 8:
                    System.out.println("Grade: A");
                    break;

                case 7:
                    System.out.println("Grade: B");
                    break;

                case 6:
                    System.out.println("Grade: C");
                    break;

                case 5:
                    System.out.println("Grade: D");
                    break;

                default:
                    System.out.println("Grade: F");
            }
        }

        sc.close();
    }
}

