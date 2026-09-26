
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        int n=5;
        System.err.println("------------Multiplication Table of 5---------------");
        for(int i=1;i<11;i++){
            int mul=n*i;

            System.out.println(n+ "*" +i+ "="+ mul);
        }
    }
}
