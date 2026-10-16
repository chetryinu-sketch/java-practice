import java.util.*;
public class PrimeNumber {
    // static void prime(int n){
    //     int i;
    //     for(i=2;i<n;i++){
    //         if(n%i==0){
    //             System.out.println(n+" is not a prime number");
    //             break;
    //         }         
    //         }
    //     if(i==n){
    //         System.out.println(n+" is a prime number");
    //     }
    //     }
    //-----------------------------------------------------
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String []args){
        System.out.println(isPrime(23));
        
    }
}
