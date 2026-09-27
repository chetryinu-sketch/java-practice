import java.util.*;
public class APseries {
    public static void main(String[] args) {
        int n,a,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms you want:");
        n=sc.nextInt();
        System.out.println("Enter first term:");
        a=sc.nextInt();
        System.out.println("Enter differance:");
        d=sc.nextInt();
       
        int Terms=a;
        System.out.println("The AP Series:");
        for(int i=1;i<=n;i++){
            System.out.print(Terms +","  );
            Terms=Terms+d;
            
            
        }
            

        
    }
}
