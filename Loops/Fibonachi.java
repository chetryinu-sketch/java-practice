import java.util.*;
public class Fibonachi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Term:");
        int a=0,b=1;
        int c;
        int n=sc.nextInt();

        System.out.println("Fobonachi series:");
        System.out.print(a+","+b+ ",");
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }

    }
}
