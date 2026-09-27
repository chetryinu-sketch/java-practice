import java.util.*;

public class invertedHalfLeft {
    public static void main(String[] args) {
        //-------------------------------------
        // for(int i=0;i<5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(j+" ");
        //     }
        //         System.out.println(" ");
        // }
        //------------------------------------
        // for(int i=0;i<5;i++){
        //     int count=0;
        //     for(int j=1;j<=5-i;j++){
        //         count++;
        //         System.out.print(count+" ");
        //     }
        //         System.out.println(" ");
        // }
        //-------------------------------------
        for(int i=1;i<=5;i++){
            int count=0;
            for(int j=1;j<=5-i+1;j++){
                count++;
                System.out.format(" %02d",count);
            }
                System.out.println(" ");
        }

    }
    
}
