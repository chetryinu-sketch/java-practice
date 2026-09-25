import java.util.*;
public class Radix {
    public void main(String args[]){
        String num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num:");
        num=sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("num is binary of radix 2");
        }
        else if(num.matches("[0-7]+")){
              System.out.println("num is octal of radix 8");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("num is decimal of radix 10");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("num is hexa of radix 16");
        }
        else{
            System.out.println("invalid number!!");
        }
    }
}
