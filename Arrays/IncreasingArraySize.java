import java.util.*;
public class IncreasingArraySize {
    public static void main(String[] args) {
        int A[]={8,6,10,9,2};
        int B[]=new int[10];

        System.out.println("Size of array A before:"+A.length);

        for(int i=0;i<A.length;i++){
            B[i]=A[i];
            System.out.print(B[i]+",");
        }

        System.out.println("");
        A=B;
        B=null;
        System.out.println("Size of array A after:"+A.length);
    }
}
