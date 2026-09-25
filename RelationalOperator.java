import java.util.*;
public class RelationalOperator {
    public static void main(String args[]){
        //----------------------------------------
        // int a=5,b=15,c=4;

        // if(a>b&&a>c){
        //     System.out.println("Larges:"+a);}
        // else if(b>c)
        // {
        //     System.out.println("Largest:"+b);
        // }
        // else{
        //     System.out.println("Largest:"+c);
        // }
        // }
        //-------------------------------------


        //Find a number is odd or even------------------
    //     int n;
    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter a number:");
    //     n=sc.nextInt();
    
    //     if(n%2==0){
    //         System.out.println("n is even:"+n);
    //     }
    //     else{
    //         System.out.println("n is odd:"+n);
    //     }
    // } -----------------------------------------------


    // Find person is young or not young-----------------
//     int age;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter your age:");
//     age=sc.nextInt();

//     if(14<age && age<55){
//         System.out.println("you are young");
//     }
//     else{
//         System.out.println("you are no more young");
//     }

// } -------------------------------------------------------


// Find grades for given marks------------------------------
int m1,m2,m3,sum;
float avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of three subjects");

m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();

sum=m1+m2+m3;
avg=sum/3;

System.out.println("Marks of three subjects:"+sum);
System.out.println("Average of three subjects:"+avg);

if(avg>=70){
    System.out.println("Grade A");
}
else if(60<=avg && avg<70){
    System.out.println("Grade B");
}
else if(50<=avg && avg<60){
    System.out.println("Grade C");
}
else if(40<=avg && avg<50){
    System.out.println("Grade D");
}
else{
    System.out.println("Fail");
}
    }
}