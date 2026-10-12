import java.util.*;
public class DeletingElement {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7,3,5,4,2};

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

        for(int i=3;i<A.length-1;i++){
            A[i-1]=A[i];
        }

        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
    }
}


// need correcton here !!!!!!!!!!!!!!!!!!!!!!!!(:>)