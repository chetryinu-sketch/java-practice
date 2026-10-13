// There are 2 methods to call an object from the main method either make the class static or create object of the class and call the method using object of the class

import java.util.*;

public class basics{

    static int max(int x,int y){            //static keyword
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String []args){
        int a=10,b=15;
        System.out.println(max(a,b));
    }    
}
//--------------------------------

// public class basics {

//     int max(int x,int y){
//         if(x>y)
//             return x;
//         else
//             return y;
//     }
//     public static void main(String []args){
//         int a=10,b=15;

//         basics mm=new basics();               // object is created
//         System.out.println(mm.max(a,b));
//     }     
// }

//-----if a value of formal parameter is modified it will not effect the actual parameter
// public class basics{

//     static void inc(int x){
//         x++;
//         System.out.println(x);
//     }
//     public static void main(String []args){
//         int a=10,b=15;
//         inc(a);
//         System.out.println(a);
//     }
// }