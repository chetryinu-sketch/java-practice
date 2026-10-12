import java.util.*;
public class ReverseCopyingArray {
    public static void main(String[] args) {
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];

        for(int i=A.length-1;i>=0;i--){
            B[i]=A[i];
            System.out.print(B[i]+",");
        }
    }
}
