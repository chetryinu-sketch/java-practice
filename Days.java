import java.util.*;
public class Days {
    public static void main(String args[]){
        int Day;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter day:");
        Day=sc.nextInt();

    if(Day==1){                                     // we can use switch case  as well
        System.out.println("Day is Monday");
    }
    else if(Day==2){
        System.out.println("Day is Tuesday");
    }
    else if(Day==3){
        System.out.println("Day is Wednesday");
    }
    else if(Day==4){
        System.out.println("Day is Thursday");
    }
    else if(Day==5){
        System.out.println("Day is Friday");
    }
    else if(Day==6){
        System.out.println("Day is Saturday");
    }
    else if(Day==7){
        System.out.println("Day is Sunday");
    }
    else{
        System.out.println("Invalid Day");
    }
}
}