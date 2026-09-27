import java.util.*;
public class GPseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,r,n:");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("GP series:");
        int Term=a;
        for(int i=1;i<=n;i++){
            System.out.print(Term+ ",");
            Term=Term*r;
        }
    }
}
