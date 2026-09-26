import java.util.*;
public class SumofNums {
    public static void main(String args[]){
        int n;
        int sum=0;

        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the number n:");
        n=sc.nextInt();
        System.out.println("sum of nums from 0 to " +n+ " are:");
      

        for(int i=1;i<=n;i++){
           
            System.out.println(sum+ "+" +i+ "="+ +(sum+i));
            sum+=i;
            

        }

    }

}
