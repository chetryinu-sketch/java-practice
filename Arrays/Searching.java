import java.util.*;
public class Searching {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key value you want to search:");
      
        key=sc.nextInt();

        for(int i=0;i<A.length;i++){
            if(key==A[i]){
    //---------------------
    //             System.out.println("Element found at index:"+i);
    //             break;
    //         }
    //         else{
    //             System.out.println("Element not found in the array!");
    //             break;
    //         }
    //     }
    // }
    //----------------------
                    System.out.println("Element Found at:"+i);
                    System.exit(0);
}
        }
        System.out.println("Not found");
}
}